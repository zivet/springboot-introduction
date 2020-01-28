package com.ioverlap.dojo.validateform.controller;

import com.ioverlap.dojo.validateform.User;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class UserController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(User user) {
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Valid User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "add";
        }
        LoggerFactory.getLogger(this.getClass()).info("save user: " + user);
        return "success";
    }

}
