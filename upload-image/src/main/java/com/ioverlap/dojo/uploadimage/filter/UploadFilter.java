package com.ioverlap.dojo.uploadimage.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

public class UploadFilter extends OncePerRequestFilter {

    private static final String EXPECTED_TYPE = "image";

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        Part part = httpServletRequest.getPart("file");
        if(part == null){
            return;
        }
        String currentType = part.getContentType().substring(0, EXPECTED_TYPE.length());
        if(!currentType.equals(EXPECTED_TYPE)){
            httpServletResponse.getWriter().write("{\"Success\":false}");
            return;
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
