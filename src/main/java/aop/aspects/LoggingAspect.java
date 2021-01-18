package aop.aspects;


import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//        @Pointcut("execution(* aop.UniLibrary.*(..))")
//        private void allMethodsFromUniLibrary(){ }
//
//        @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
//        private void returnMagazineFromUniLibrary(){}
//
//        @Pointcut ("allMethodsFromUniLibrary() " +
//                "&&  !returnMagazineFromUniLibrary())")
//        private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//        @Before ("allMethodsExceptReturnMagazineFromUniLibrary()")
//        public void beforeAllMethodsExceptReturnMagazineAdvice() {
//            System.out.println("beforeAllMethodsExceptReturnMagazineAdvice(): writing log#10");
//        }
//
//




//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnedMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing log#1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//         System.out.println("beforeReturnLoggingAdvice: writing log#2");
//    }
//
//    @Before("allGetAndReturnedMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log#3");
//    }




    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
       MethodSignature methodSignature =(MethodSignature) joinPoint.getSignature();
       System.out.println("methodSignature = " + methodSignature);
       System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
       System.out.println("methodSignature.getReturnType() = "
               + methodSignature.getReturnType());
       System.out.println("methodSignature.getName() = "
               + methodSignature.getName());

       if(methodSignature.getName().equals("addBook")) {
           Object[] arguments = joinPoint.getArgs();
           for (Object obj: arguments) {
               if (obj instanceof Book) {
                   Book myBook = (Book)obj;
                   System.out.println("Инофрмация о книге: название - " +myBook.getName()
                                   + ", автор - " + myBook.getAuthor()
                                   + ", год издания - " + myBook.getYearOfPublication() );
               }
               else if (obj instanceof String) {
                   System.out.println(" Книгу в библиотеку добавил:" + (String)obj);
               }

           }

       }


        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("--------------------------------");
    }



//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }
}
