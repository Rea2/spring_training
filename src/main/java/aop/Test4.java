package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConf.class);

        Person person = context.getBean("personBean1", Person.class);
        person.sayHello();
        context.close();
    }

}
