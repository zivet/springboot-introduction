package com.ioverlap.dojo.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;

@Controller
public class UserController {

    public static final String USER = "/demo";

    public static final String GRADE = "/grade";

    @RequestMapping(value = USER, method = RequestMethod.GET)
    public String demo(Model model) {
        model.addAttribute("hello", "Hello Thymeleaf");
        return "demo";
    }

    @RequestMapping(value = GRADE, method = RequestMethod.GET)
    public String grade(Model model) {
        double grade = 90.5;
        model.addAttribute("grade", grade);
        model.addAttribute("gpa", convertGPA(grade));
        return "grade";
    }

    private String convertGPA(double grade) {
        if(grade >= 90) {
            return "A";
        }
        else if(grade >=80) {
            return "B";
        }
        else if(grade >= 70) {
            return "C";
        }
        else if(grade >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }


}
