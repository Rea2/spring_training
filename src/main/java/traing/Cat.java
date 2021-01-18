package traing;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
@Scope("prototype")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat is created");
    }

    public void say() {
        System.out.println("Cat: Mau-mau");
    }

    @PostConstruct
    private void init(){
        System.out.println("Cat: init-method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Cat: destroy-method");
    }

}
