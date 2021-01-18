package traing;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog is created");
    }

    public void say() {
        System.out.println("Dog: Gav-Gav");
    }

    @PostConstruct
    private void init(){
        System.out.println("Dog: init-method");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Dog: destroy-method");
    }
}
