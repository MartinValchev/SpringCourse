package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingService;

public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
