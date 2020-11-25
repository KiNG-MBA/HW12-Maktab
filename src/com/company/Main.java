package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter a text :");
            String text = input.next();
            System.out.println("Enter a number :");
            int number = input.nextInt();
            System.out.printf("%-15s%03d\n", text, number);
        }
    }
}
