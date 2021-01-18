package aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Import;


@Configuration
@Import(aop.aspects.PersonAspects.class)
@Aspect
public class MyConf {
    @Bean
    public Person personBean1(){
        return new Person("Dima", 18, 1050.2);
    }

    @Bean
    public Person personBean2(){
        return new Person("Vova", 18, 2050.2);
    }
}
