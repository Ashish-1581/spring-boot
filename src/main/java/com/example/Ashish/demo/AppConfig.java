package com.example.Ashish.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //for manually creating object not by spring
public class AppConfig {
    @Bean //making it been so i do not call getApple() to create object dependecy injection will do it for me as it is a bean
    apple getApple() {
        return new apple();
    }

}
