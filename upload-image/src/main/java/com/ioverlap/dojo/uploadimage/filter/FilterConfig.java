package com.ioverlap.dojo.uploadimage.filter;

import com.ioverlap.dojo.uploadimage.controller.UploadController;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<UploadFilter> filterRegistrationBean() {
        FilterRegistrationBean<UploadFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new UploadFilter());
        filterRegistrationBean.addUrlPatterns(UploadController.UPLOAD);
        return filterRegistrationBean;
    }
}
