package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class UserInput {
    static void main() {
        // Create an object of Scanner / Instantiation

        Scanner i = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = i.nextLine();

        System.out.print("Enter your age: ");
        int age = i.nextInt();

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);


    }
}
