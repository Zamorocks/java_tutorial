package com.pluralsight.organized;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello World");

        // Primitive Variable types


        // short is 16-bit (smaller numbers);
        short myShort = 847;
//        System.out.println(myShort);

        // int is 32-bit
        int myNumber;
        myNumber = 88;
//        System.out.println(myNumber);

        // long
        long myLong = 9797;
//        System.out.println(myLong);

        // float (put f at end otherwise Java will declare the number as a double)
        float myFloat = 324.3f;
//        System.out.println(myFloat);

        // double is like a float but longer
        double myDouble = 7.3243;
//        System.out.println(myDouble);

        // char type which can hold a unicode character
        char myChar = 'y';
//        System.out.println(myChar);

        // boolean
        boolean myBoolean = true;
//        System.out.println(myBoolean);

        // byte (holds just 8-bits of data)
        byte myByte = 127;
//        System.out.println(myByte);

        // Non-Primitive Variable Types

        String text = "Hello";

        String blank = " ";
        String name = "Bob";
        String greeting = text + blank + name;

//        System.out.println(greeting);
//
//        System.out.println("Hello," + " " + "Rob");
//
//        System.out.println("My integer is: " + myNumber);

        double myDouble2= 7.8;
//        System.out.println("My double number is: " + myDouble2);

//        int value = 10;
//        boolean loop = value > 20;

        // while loop
        int value = 0;
        while(value < 10) {
//            System.out.println("Hello " + value);
            value = value + 1;
        }

        // For loops
        for(int i=0; i < 5; i++) {
//            System.out.printf("The value of i is: %d\n", i);
        }

        // If statement

        int myInt = 15;

        if(myInt < 10) {
//            System.out.println("Yes, it's true");
        } else if (myInt > 20){
//            System.out.println("No, it's false");
        } else {
//            System.out.println("None of the above.");
        }

        // Get user input
//        Scanner input = new Scanner(System.in);

        // Output the prompt
//        System.out.println("Enter a line of text: ");
        // Wait for the user to enter a line of text
//        String line = input.nextLine();

        // Wait for the user to enter an integer
//        int intValue = input.nextInt();

        // Wait for the user to enter a double value
//        double doubleVal = input.nextDouble();

        // Tell them what they entered
//        System.out.println("You've entered: " + line);

        // Do While
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a number: ");

        int val = scanner.nextInt();

        while(val != 5) {
            System.out.println("Enter a number: ");
            val = scanner.nextInt();
        }
        System.out.println("Got 5!");

    }
}
