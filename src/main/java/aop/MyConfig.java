package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan ("aop")
@EnableAspectJAutoProxy
public class MyConfig {
    public static void main(String[] args) {

    }
}


