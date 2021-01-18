package traing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {


    private Pet pet;

    @Value("${person.age}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person is created");
    }

    public Person(Pet pet) {
        super();
        this.pet = pet;
        System.out.println(pet.getClass());

    }

    public Pet getPet() {
        return pet;
    }

    @Autowired
    @Qualifier ("dog")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my dear Pet");
        pet.say();
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
