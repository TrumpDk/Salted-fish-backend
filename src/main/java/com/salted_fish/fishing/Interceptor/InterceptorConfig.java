package com.salted_fish.fishing.Interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    // avoid null pointer exception https://www.cnblogs.com/lori/p/9259864.html
    @Bean
    public RequestInterceptor interceptorCreator() {
        return new RequestInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorCreator()).addPathPatterns("/**").excludePathPatterns("/LogIn", "/Register",
                "/FindUserByName", "/loadHomeData", "/getCates", "/getSubCates", "/getInitCates", "/getSubCatesList",
                "/getItemDetail");
    }
}