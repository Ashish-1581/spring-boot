package com.example.Ashish.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component
public class apple {

    public void display() {
        System.out.println("This is an apple.");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed()
    {
        System.out.println("creating the apple before use");
    }
    @PreDestroy
    void callThisAfterAppleIsUsed()
    {
        System.out.println("destroying the apple after use");
    }
}
