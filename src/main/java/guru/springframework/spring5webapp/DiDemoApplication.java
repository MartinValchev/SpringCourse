package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.controllers.ConstructorInjectedController;
import guru.springframework.spring5webapp.controllers.GetterInjectedController;
import guru.springframework.spring5webapp.controllers.MyController;
import guru.springframework.spring5webapp.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {
    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class,args);
        MyController controller =  (MyController)ctx.getBean("myController");
        System.out.println(((PropertyInjectedController)ctx.getBean(PropertyInjectedController.class)).sayHello());
        System.out.println(((GetterInjectedController)ctx.getBean(GetterInjectedController.class)).sayHello());
        System.out.println(((ConstructorInjectedController)ctx.getBean(ConstructorInjectedController.class)).sayHello());
        System.out.println("Completed successfully");
    }
}
