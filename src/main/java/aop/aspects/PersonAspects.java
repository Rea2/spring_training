package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class PersonAspects {

        @Before("execution(* *(..))")
        public void beforeMethodHelloAdvice(){
            System.out.println("beforeMethodHelloAdvice: logging before calling method");
        }
}
