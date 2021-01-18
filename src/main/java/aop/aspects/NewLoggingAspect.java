package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(* returnBook())")
    public Object aroundReturnBooksLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBooksLoggingAdvice():" +
                " в библиотеку пытаются вернуть книгу");

//        long begin = System.currentTimeMillis();

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Было поймано исключение " + e);
            throw e;
        }


        System.out.println("aroundReturnBooksLoggingAdvice():" +
                " в библиотеку возвращают книгу");
//        long ends = System.currentTimeMillis();
//        System.out.println("aroundReturnBooksLoggingAdvice(): выполнил работу за " +
//                (ends  - begin) + "мс");

        return targetMethodResult;
    }
}
