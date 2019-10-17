package com.salted_fish.fishing.Interceptor;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    private static final List<String> excludedPaths = Arrays.asList("/LogIn", "/Register", "/FindUserByName");

    // avoid null pointer exception https://www.cnblogs.com/lori/p/9259864.html
    @Bean
    public RequestInterceptor interceptorCreator() {
        return new RequestInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorCreator()).addPathPatterns("/**").excludePathPatterns(excludedPaths);
    }
}