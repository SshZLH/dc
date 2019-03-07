package com.d;

import com.d.cathelper.CatServletFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CatFilterConfigure {

    @Bean
    public FilterRegistrationBean catFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        CatServletFilter filter = new CatServletFilter();
        registration.setFilter(filter);
        registration.addUrlPatterns("/*");
        registration.setName("cat-filter");
        registration.setOrder(1);
        return registration;
    }
}
