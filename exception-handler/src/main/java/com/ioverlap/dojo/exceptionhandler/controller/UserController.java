package com.ioverlap.dojo.exceptionhandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add() {
        int num = 10 / 0;// throw exception
        return "add";// not used
    }

    @RequestMapping("/update")
    public String update() {
        String name = null;
        name = name.toLowerCase();
        return "update";
    }
}