package com.api3wings.apirest3wings.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors {
    @Bean
    public WebMvcConfigurer corsConfigurer(){
     return new WebMvcConfigurer(){
        @Override
        public void addCorsMappings(CorsRegistry registro ) {
registro
.addMapping("/**")
.allowedOrigins("*")
.allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
.allowedHeaders("*");

        }

     };
    }
}
