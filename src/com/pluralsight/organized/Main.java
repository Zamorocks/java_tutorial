package com.pluralsight.organized;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Do While
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter a number: ");
        int val = scanner.nextInt();
        while(val != 5) {
            System.out.println("Enter a number: ");
            val = scanner.nextInt();
        }*/

        int value;
        do{
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        while(value != 5);
        System.out.println("Got 5!");

    }
}
