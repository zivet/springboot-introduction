package com.ioverlap.dojo.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Map<String, String> hello(){
        Map<String, String> result = new HashMap<>();
        result.put("greeting", "Hello");
        return result;
    }
}
