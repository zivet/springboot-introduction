package com.ioverlap.dojo.log.controller;

import org.apache.logging.log4j.LogManager;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class LogController {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger("HelloWorld");

    @GetMapping(value = "/log")
    public String log() {

        //Java Util Logging
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "==> logging");

        //logback
        LoggerFactory.getLogger(this.getClass()).info("==> slf4j api");

        //log4j2
        LogManager.getLogger(this.getClass()).info("==> log4j2");

        return "Look at the console";
    }
}
