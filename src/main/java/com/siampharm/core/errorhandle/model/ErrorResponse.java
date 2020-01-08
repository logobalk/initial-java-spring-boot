//package com.siampharm.core.errorhandle.model;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.siampharm.core.model.GenericResponse;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//@JsonInclude(JsonInclude.Include.NON_NULL)
//public class ErrorResponse extends GenericResponse {
//
//    private String error;
//    private String detail;
//    private Exception exception;
//
//    @Builder
//    public ErrorResponse(int code, String error, String detail, Exception exception) {
//        super(code);
//        this.error = error;
//        this.detail = detail;
//        this.exception = exception;
//    }
//}
