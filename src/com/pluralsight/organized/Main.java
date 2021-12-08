package com.pluralsight.organized;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*--------------------------- DO...WHILE --------------------------------*/
//        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter a number: ");
        int val = scanner.nextInt();
        while(val != 5) {
            System.out.println("Enter a number: ");
            val = scanner.nextInt();
        }*/

//        int value;
//        do{
//            System.out.println("Enter a number: ");
//            value = scanner.nextInt();
//        }
//        while(value != 5);
//        System.out.println("Got 5!");
//    }

        /*--------------------------- SWITCH CASES --------------------------------*/

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch(text) {
            case "start":
                System.out.println("Machine started!");
                break;
            case "stop":
                System.out.println("Machine stopped.");
            default:
                System.out.println("Command not recognized");
        }

    }
}
