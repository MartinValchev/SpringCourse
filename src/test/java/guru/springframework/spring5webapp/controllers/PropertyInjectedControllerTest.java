package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp()throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws  Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());
    }
}
