package traing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Pet myCat = context.getBean("myCat", Pet.class);
        Pet myDog = context.getBean("dog", Pet.class);
        Pet myCat = context.getBean("catBean", Pet.class);

        Person person = context.getBean("person", Person.class);
        person.sayHello();
        System.out.println(person);
        ((Cat)myCat).destroy();
        context.close();
    }
}
