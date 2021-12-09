package com.pluralsight.organized;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* -------------------------------------------------------------- ARRAYS --------------------------------------------------------------*/

//        int value = 7;
//        int[] values;
//        values = new int[3];
//        System.out.println(values[0]);
//
//        values[0] = 10;
//        values[1] = 11;
//        values[2] = 12;
//
////        System.out.println(values[0]);
////        System.out.println(values[1]);
////        System.out.println(values[2]);
//
//        for(int i = 0; i < values.length; i++) {
//            System.out.println(values[i]);
//        }
//
//        int[] numbers = {5, 6, 7};
//
//        for(int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        /* ---------------------------------------------------- ARRAYS OF STRINGS ----------------------------------------------------*/

//        String[] fruits = {"apple", "banana", "pear", "kiwi"};
//
//        for(String fruit: fruits) {
//            System.out.println(fruit);
//        }
//
//        int value = 0;
//
//        String text = null;
//        System.out.println(text);
//
//        String[] texts = new String[2];
//        System.out.println(texts[0]);
//

        /* -------------------------------------------------- MULTI-DIMENSIONAL ARRAYS --------------------------------------------------*/

        int[][] grid = {
            {3, 5, 2343 },
            {2, 4 },
            {1, 2, 3, 4}
        };

        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        String[][] texts = new String[2][3];

        texts[0][0] = "Hello there";

        System.out.println(texts[0][0]);

        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

        String[][] words = new String[2][];

        System.out.println(words[0]);

        words[0] = new String[3];
        words[0][1] = "hi there";

        System.out.println(words[0][1]);
    }
}
