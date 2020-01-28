package com.ioverlap.dojo.exceptionhandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add() {
        int num = 10 / 0;// throw exception
        return "add";// not used
    }

    @ExceptionHandler(value = {
            java.lang.ArithmeticException.class
    })
    public ModelAndView handlerArithmeticException(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e.toString());
        modelAndView.setViewName("mathError");
        return modelAndView;
    }

    @RequestMapping("/update")
    public String update() {
        String name = null;
        name = name.toLowerCase();
        return "update";
    }

    @ExceptionHandler(value = {
            java.lang.NullPointerException.class
    })
    public ModelAndView handlerNullPointerException(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e.toString());
        modelAndView.setViewName("nullPointerError");
        return modelAndView;
    }
}