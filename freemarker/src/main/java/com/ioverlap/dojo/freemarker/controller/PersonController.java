package com.ioverlap.dojo.freemarker.controller;

import com.ioverlap.dojo.freemarker.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class PersonController {

    public static final String PERSON = "/person";

    @RequestMapping(method = RequestMethod.GET, value = PERSON)
    public String person(Model model) {
        List<Person> personList = Arrays.asList(
                new Person("pep", "pepe@gmail.com", 489654147),
                new Person("zakk", "zakk@gmail.com", 558712654)
        );
        model.addAttribute("person", personList);
        return "person";
    }
}
