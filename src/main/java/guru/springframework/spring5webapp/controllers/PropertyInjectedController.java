package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayHello();

    }
}
