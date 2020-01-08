package com.siampharm.core.security.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Aspect
@Component
public class KeycloakFilterInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(KeycloakFilterInterceptor.class);

    /*@Autowired
    private SiamErrorController siamErrorController;*/

    @After("execution(* org.keycloak.adapters.springsecurity.filter.KeycloakAuthenticatedActionsFilter.doFilter(..))")
    public void afterKeycloakAuthenticatedActionsFilter(JoinPoint joinPoint) {
        logger.debug(" AfterKeycloakAuthenticated : {}", joinPoint);

        // Type of Arguments is [ServletRequest,ServletResponse,FilterChain]
        Object[] joinPointArgs = joinPoint.getArgs();

        if (logger.isDebugEnabled()) logger.debug("JoinPoint Args : ", joinPointArgs);

        if (joinPointArgs == null || joinPointArgs.length < 1) {
            logger.warn("Can't inject After Keycloak Authenticated.");
            logger.warn("  JoinPoint Args is ", joinPointArgs);
            return;
        }

        HttpServletRequest servletRequest = (HttpServletRequest) joinPointArgs[0];
        HttpServletResponse servletResponse = (HttpServletResponse) joinPointArgs[1];

        int httpStatus = servletResponse.getStatus();

        if (httpStatus >= 200 && httpStatus < 400) {
            logger.debug("Status OK, Just ignored.");
            return;
        }

        if (!servletResponse.isCommitted()) {
            try {
                servletRequest
                        .getRequestDispatcher("/error")
                        .forward(servletRequest, servletResponse);

                /*PrintWriter writer = servletResponse.getWriter();
                writer.write(siamErrorController.index(null, servletRequest, servletResponse).toString());
                writer.flush();*/
            } catch (IOException | ServletException ignored) {
            }
        } else {
            logger.debug("Response has been committed, Just ignored.");
        }
    }

    /*@Before("execution(* org.keycloak.adapters.authorization.KeycloakAdapterPolicyEnforcer.*(..))")
    public void beforeKeycloakAdapterPolicyEnforcer(JoinPoint joinPoint) {
        logger.info(" Before : {}", joinPoint);
    }*/

    /*@Before("execution(* com.siampharm.productinfo.controller.*.*(..))")
    public void beforeAnyMethod(JoinPoint joinPoint) {
        logger.info(" beforeAnyMethod : {}", joinPoint);
    }*/


}
