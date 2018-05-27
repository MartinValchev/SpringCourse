package guru.springframework.spring5webapp.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello - I am injected via the constructor";
    }
}
