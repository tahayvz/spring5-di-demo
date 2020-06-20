package com.springframework.controllers;

import com.springframework.services.GreetingService;
import com.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){

        return greetingServiceImpl.sayGreeting();
    }

}