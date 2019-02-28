package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class WebCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebCrudApplication.class, args);
    }
    /**
     * SpringBoot集成MVC
     * ViewResolver 视图解析器
     */
    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    private  static  class MyViewResolver implements  ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }


}
