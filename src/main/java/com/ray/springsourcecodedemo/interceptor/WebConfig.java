package com.ray.springsourcecodedemo.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Component
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private AInterceptor aInterceptor;

    @Autowired
    private BInterceptor bInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(aInterceptor).addPathPatterns("/i/**");
        registry.addInterceptor(bInterceptor).addPathPatterns("/i/**");

    }


}
