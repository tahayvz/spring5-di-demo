package com.springframework.controllers;

import com.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }
    @Autowired
    public void setGreetingService(GreetingService greetingService) {

        this.greetingService = greetingService;
    }
}