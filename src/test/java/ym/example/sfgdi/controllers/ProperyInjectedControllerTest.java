package ym.example.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ym.example.sfgdi.services.ConstructorGreetingService;

class ProperyInjectedControllerTest {

    ProperyInjectedController properyInjectedController;

    @BeforeEach
    void setUp(){
        properyInjectedController = new ProperyInjectedController();
        properyInjectedController.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(properyInjectedController.getGreeting());
    }
}