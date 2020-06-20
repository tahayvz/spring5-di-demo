package com.springframework.controllers;

import com.springframework.services.GreetingService;


public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}