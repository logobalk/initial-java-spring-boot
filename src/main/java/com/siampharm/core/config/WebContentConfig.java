package com.siampharm.core.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.siampharm.core.converter.DateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.List;

@Configuration
@EnableWebMvc
@EnableAutoConfiguration
public class WebContentConfig implements WebMvcConfigurer {

    /*private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/",
            "classpath:/static/", "classpath:/public/"};*/

    @Autowired
    private HttpServletResponse httpServletResponse;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/webjars/**")) {

            registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");

            registry.addResourceHandler("/webjars/**").addResourceLocations(
                    "classpath:/META-INF/resources/webjars/");
        }

        registry
                .addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/static/");

        // React fallback
        registry
                .addResourceHandler("", "/", "/**")
                .resourceChain(true)
                .addResolver(new ReactResourceResolver(httpServletResponse));
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/", ".html");
    }


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setPrettyPrint(true);
        mappingJackson2HttpMessageConverter.setObjectMapper(objectMapper());

        converters.add(mappingJackson2HttpMessageConverter);
    }

    private ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        JavaTimeModule javaTimeModule = new JavaTimeModule();

        //Add serializer/deserializer
        javaTimeModule.addSerializer(Timestamp.class, new DateConverter.TimestampSerializer());
        javaTimeModule.addDeserializer(Timestamp.class, new DateConverter.TimestampDeserializer());

        //Register Time Module
        objectMapper.registerModule(javaTimeModule);
        objectMapper.setDateFormat(DateConverter.format);

        return objectMapper;
    }
}
