package com.ioverlap.dojo.exceptionhandler.controller.exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class MySimpleMappingExceptionResolverConfig {

    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties mapping = new Properties();
        mapping.put("java.lang.ArithmeticException", "mathError");
        mapping.put("java.lang.NullPointerException", "nullPointerError");
        resolver.setExceptionMappings(mapping);
        return resolver;
    }
}
