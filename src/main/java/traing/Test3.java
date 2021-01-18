package traing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);


        Pet myDog = context.getBean("dog", Pet.class);
        Pet myCat = context.getBean("catBean", Pet.class);

        Person person = context.getBean("person", Person.class);
        person.sayHello();
        System.out.println(person);
        ((Cat)myCat).destroy();
        context.close();
    }
}
