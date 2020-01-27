package com.ioverlap.dojo.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ScopeController {

    @RequestMapping(value = "/scope", method = RequestMethod.GET)
    public String scope(HttpServletRequest httpServletRequest) {
        // Request
        httpServletRequest.setAttribute("request", "request data");
        // Session
        httpServletRequest.getSession().setAttribute("session", "session data");
        // Application
        httpServletRequest.getSession().getServletContext().setAttribute("application", "application data");
        return "scope";
    }
}
