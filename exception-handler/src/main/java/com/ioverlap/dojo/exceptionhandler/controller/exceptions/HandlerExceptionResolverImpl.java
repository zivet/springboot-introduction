package com.ioverlap.dojo.exceptionhandler.controller.exceptions;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class HandlerExceptionResolverImpl implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof ArithmeticException) {
            modelAndView.setViewName("mathError");
        }
        if(e instanceof NullPointerException) {
            modelAndView.setViewName("nullPointerError");
        }
        modelAndView.addObject("exception", e.toString());
        return modelAndView;
    }
}
