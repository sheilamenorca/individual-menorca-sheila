package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class NestedIfStatement {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Age Categorizer ---");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 120) { // Validation
            if (age <= 2) { // 0 - 2
                System.out.println("Category: Baby");
            } else if (age <= 12) { // 3 - 12
                System.out.println("Category: Child");
            } else if ( age <= 19) {
                System.out.println("Category: Teenager");
            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Age! Age must be greater 0");
        }

        sc.close();

    }
}
