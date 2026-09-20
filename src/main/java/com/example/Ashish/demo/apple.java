package com.example.Ashish.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
//@Component  //this annotaion inform spring that the class should be managed as a bean.
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
