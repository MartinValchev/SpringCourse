package guru.springframework.spring5webapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("I am in lifcycle bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("*bean factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("*bean has been destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("*bean properties has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("*Application context has been set");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("*Post construct method is called");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Predestroy method has been called");
    }
    public void beforeInit(){
        System.out.println("*Before init has been called by bean post processor");
    }
    public void afterInit(){
        System.out.println("*After init has been called by bean post processor");
    }
}
