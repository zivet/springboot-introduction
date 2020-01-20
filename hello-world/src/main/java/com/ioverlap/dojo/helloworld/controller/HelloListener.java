package com.ioverlap.dojo.helloworld.controller;

import javax.servlet.ServletContextListener;

public class HelloListener implements ServletContextListener {

    @Override
    public void contextInitialized(javax.servlet.ServletContextEvent sce) {
        System.out.println("Servlet Context Initialized");
    }

    @Override
    public void contextDestroyed(javax.servlet.ServletContextEvent sce) {
        System.out.println("Servlet Context Destroyed");
    }
}
