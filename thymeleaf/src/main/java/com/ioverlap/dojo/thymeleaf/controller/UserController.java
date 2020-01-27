package com.ioverlap.dojo.thymeleaf.controller;

import com.ioverlap.dojo.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    public static final String DEMO = "/demo";

    public static final String GRADE = "/grade";

    public static final String USER = "/user";

    @RequestMapping(value = DEMO, method = RequestMethod.GET)
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

    @RequestMapping(value = USER, method = RequestMethod.GET)
    public String user(Model model) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Tom", 30));
        userList.add(new User(2, "Jerry", 29));
        userList.add(new User(3, "Nancy", 27));
        model.addAttribute("userList", userList);
        return "user";
    }

}
