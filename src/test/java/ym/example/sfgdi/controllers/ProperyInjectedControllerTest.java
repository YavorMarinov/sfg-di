package ym.example.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ym.example.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ProperyInjectedControllerTest {

    ProperyInjectedController properyInjectedController;

    @BeforeEach
    void setUp(){
        properyInjectedController = new ProperyInjectedController();
        properyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(properyInjectedController.getGreeting());
    }
}