package util;

public class Person {
  // Instance variables (data or "state")
  String name;
  int age;

  // class is a blueprint for creating objects

  // 1. Data
  // 2. Subroutines (methods)
  void speak() {
    System.out.println("Hello.  My name is " + name + " and I am " + age + " years old.");
  }

  void sayHello() {
    System.out.println("Hello there");
  }

  public int calculateYearsToRetirement() {
    int yearsLeft = 65 - age;
//        System.out.println(yearsLeft);
    return yearsLeft;
  }

  public int getAge(){
    return age;
  };

  public String getName() {
    return name;
  }

}
