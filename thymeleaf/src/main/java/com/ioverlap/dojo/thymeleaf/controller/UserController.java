package com.ioverlap.dojo.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    public static final String USER = "/demo";

    @RequestMapping(value = USER, method = RequestMethod.GET)
    public String demo(Model model) {
        model.addAttribute("hello", "Hello Thymeleaf");
        return "demo";
    }
}
