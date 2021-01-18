package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Person {


    private String name;
    private int age;
    private double avgSalary;


    public Person(String name, int age, double avgSalary) {
        this.name = name;
        this.age = age;
        this.avgSalary = avgSalary;
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

    public double getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(double avgSalary) {
        this.avgSalary = avgSalary;
    }

    public void sayHello() {
        System.out.println("Hello, everyone");
    }
}
