package ym.example.sfgdi.controllers;

import ym.example.sfgdi.services.GreetingService;

public class ProperyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
