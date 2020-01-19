package com.ioverlap.dojo.helloworld.controller;

import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        System.out.println("Running Servlet ...");
    }

}
