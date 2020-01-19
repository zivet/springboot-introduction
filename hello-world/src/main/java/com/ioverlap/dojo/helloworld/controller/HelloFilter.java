package com.ioverlap.dojo.helloworld.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "helloFilter", urlPatterns = "/helloServlet")
public class HelloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("==> Start Filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("==> End Filter");
    }
}
