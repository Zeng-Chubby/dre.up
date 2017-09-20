package com.unnnn.webapi.filter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理过滤器。
 */
@ControllerAdvice
public class GlobalExceptionHandlerFiler {

    @ExceptionHandler
    public ModelAndView defaultExceptionHandler(HttpServletRequest httpServletRequest, Exception exception) throws Exception {
        Class exceptionClass = exception.getClass();
        System.out.println(exception.getMessage());
        return null;
    }
}
