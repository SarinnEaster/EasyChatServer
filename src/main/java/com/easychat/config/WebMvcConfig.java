package com.easychat.config;

import com.easychat.interceptor.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: Ann
 * date: 2024/12/22.
 * describe: WebMvc配置
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private AuthInterceptor authInterceptor;
    /**
     * 注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns();
    }
}
