package com.xiaot.blog.config;

import com.xiaot.blog.interceptor.JwtInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xiaoT
 */
@Configuration
public class WebInterceptor implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JwtInterceptor())
                .excludePathPatterns("/user/login",
                        "/swagger-ui/**",
                        "/swagger-resources/**",
                        "/v2/**")
                .addPathPatterns("/**");
    }

}
