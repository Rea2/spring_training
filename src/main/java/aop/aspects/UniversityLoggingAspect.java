package aop.aspects;

import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void  beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: " +
//                "логируем получение списка студентов перед методом getStudents() ");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//                    returning =  "students")
//    public void  afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> students){
//       Student firstStudent = students.get(0);
//
//       String nameSurname = firstStudent.getNameSurname();
//       nameSurname = "Mr." + nameSurname;
//       firstStudent.setNameSurname(nameSurname);
//
//       double avgGrade = firstStudent.getAverageScore();
//       avgGrade=avgGrade+ 1;
//       firstStudent.setAverageScore(avgGrade);
//       students.add(0,firstStudent);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: " +
//                "логируем получение списка студентов после метода getStudents()");
//    }

//    @AfterThrowing(pointcut ="execution(* getStudents())",
//                   throwing = "exception")
//    public void  afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения " + exception);
//    }

      @After("execution(* getStudents())")
     public void afterGetStudentAdvice(){
          System.out.println("afterGetStudentAdvice():логируем нормальное завершение работы или выброс исключения ");
      }
}
