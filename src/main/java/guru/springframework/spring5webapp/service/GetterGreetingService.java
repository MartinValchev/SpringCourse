package guru.springframework.spring5webapp.service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello I am injected by getter";
    }
}
