package com.siampharm.core.config;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.resource.ResourceResolver;
import org.springframework.web.servlet.resource.ResourceResolverChain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ReactResourceResolver implements ResourceResolver {
    // this is the same directory you are using
    // in package.json "build-spring-linux",
    // example REACT_DIR/index.html
    private static final String REACT_DIR = "/static/";

    // this is directory inside REACT_DIR for react static files
    // example REACT_DIR/REACT_STATIC_DIR/js/
    // example REACT_DIR/REACT_STATIC_DIR/css/
    private static final String REACT_STATIC_DIR = "public";

    private static final Pattern STATIC_FILE_REGEX = Pattern.compile("/public/|favicon\\.ico|manifest\\.json|sw\\.js|/.*\\.gz|robot\\.txt");

    private final HttpServletResponse httpServletResponse;
    private Resource index = new ClassPathResource(REACT_DIR + "index.html");
    private List<String> rootStaticFiles = Arrays.asList(
            "favicon.ico", "asset-manifest.json", "manifest.", "sw.js",
            ".chunk.js", "icon_", "main.", "vendor."
    );

    public ReactResourceResolver() {
        httpServletResponse = null;
    }

    ReactResourceResolver(HttpServletResponse httpServletResponse) {
        this.httpServletResponse = httpServletResponse;
    }

    @Override
    public Resource resolveResource(HttpServletRequest request, String requestPath,
                                    List<? extends Resource> locations, ResourceResolverChain chain) {
        if (httpServletResponse != null) {
            int status = httpServletResponse.getStatus();
            if (status != 200) {
                return chain.resolveResource(request, requestPath, locations);
            }
        }
        return resolve(requestPath, locations);
    }

    @Override
    public String resolveUrlPath(String resourcePath, List<? extends Resource> locations, ResourceResolverChain chain) {
        Resource resolvedResource = resolve(resourcePath, locations);
        if (resolvedResource == null) {
            return null;
        }
        try {
            return resolvedResource.getURL().toString();
        } catch (IOException e) {
            return resolvedResource.getFilename();
        }
    }

    private Resource resolve(String requestPath, List<? extends Resource> locations) {
        if (requestPath == null) return null;

        if (requestPath.startsWith(REACT_STATIC_DIR)
                || STATIC_FILE_REGEX.matcher(requestPath).matches()) {
            return new ClassPathResource(REACT_DIR + requestPath);
        } else
            return index;
    }

}
