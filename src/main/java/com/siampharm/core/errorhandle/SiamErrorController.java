//package com.siampharm.core.errorhandle;
//
//import com.siampharm.core.errorhandle.model.ErrorResponse;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Map;
//
//@RestController
//public class SiamErrorController implements ErrorController {
//
//    private static final transient Logger logger = LoggerFactory.getLogger(SiamErrorController.class);
//
//    private static final String ERROR_MAPPING = "/error";
//
//    private ErrorResponse getErrorMessageByHttpStatus(int httpStatus) {
//        // Fixme: Code kak kak. I will fix this later.
//
//        ErrorResponse.ErrorResponseBuilder errorRespBuilder = ErrorResponse.builder();
//        errorRespBuilder.code(httpStatus);
//
//        if (httpStatus == 401) {
//            errorRespBuilder
//                    .error("Unauthorized")
//                    .detail("Get ticket first");
//        } else if (httpStatus == 403) {
//            errorRespBuilder
//                    .error("Forbidden")
//                    .detail("Access Denied");
//        }
//
//        return errorRespBuilder.build();
//    }
//
//    public String getErrorPath() {
//        return ERROR_MAPPING;
//    }
//
//    @RequestMapping(value = ERROR_MAPPING)
//    @ResponseBody
//    public ResponseEntity<?> index(
//            @RequestBody(required = false) Map<String, Object> request,
//            HttpServletRequest req, HttpServletResponse response
//    ) {
//        logger.debug("Error controller");
//        logger.debug("Request body : " + request);
//
//        int httpStatus = response.getStatus();
//
//        ErrorResponse errorResponse = getErrorMessageByHttpStatus(httpStatus);
//
//        return ResponseEntity.status(httpStatus).body(errorResponse);
//    }
//}
