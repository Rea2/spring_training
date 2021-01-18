package traing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet myCat = context.getBean("myCat", Pet.class);
        Pet myDog = context.getBean("myDog", Pet.class);
        Person person = context.getBean("myPerson", Person.class);
        person.sayHello();
        System.out.println(person);

        context.close();
    }
}
