package com.springboot.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * WebMvcConfigurerAdapter
 * 用来扩展SpringMVC的功能
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        registry.addViewController("/springboot").setViewName("success");
        registry.addViewController("/bootstrap").setViewName("bootstrap");
    }
}
