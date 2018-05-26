package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class GetterInjectionControllerTest {
    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp()throws Exception{
        this.getterInjectedController = new GetterInjectedController();
        getterInjectedController.setGreetingService(new GreetingServiceImpl());

    }
    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS,getterInjectedController.sayHello());
    }

}
