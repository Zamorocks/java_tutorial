package com.pluralsight.organized;
import util.Robot;
import util.Person;


public class Main {

    public static void main(String[] args) {

        Robot sam = new Robot();
        sam.speak("Señor Roboto.");
        sam.jump(7);
        sam.move("West", 12.2);

        Person person1 = new Person();
//        person1.name = "Joe Bloggs";
//        person1.age = 37;

        int years = person1.calculateYearsToRetirement();
        System.out.println("Years until retirement " + years);
        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

    }
}
