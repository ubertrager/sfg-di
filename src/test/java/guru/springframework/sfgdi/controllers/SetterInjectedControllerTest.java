package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectionGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectionGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}