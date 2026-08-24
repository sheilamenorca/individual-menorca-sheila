package com.joysistvi.stage1.day5;

import java.util.Scanner;

public class Activity3_Menorca {
    static void main() {
        Scanner i = new Scanner(System.in);

        // Task 2: Determine if the person is allowed to enter an event
        System.out.println("===== EVENT ENTRY CHECK ===== ");
        System.out.print("Enter your age: ");
        int age = i.nextInt();

        System.out.print("Has valid ID? (true/false): ");
        boolean hasValidID = i.nextBoolean();

        String isAllowed = age >= 18 && hasValidID ? "Yes":"No";
        System.out.println("Allowed to enter the event: " + isAllowed);

        // Task 3: Determine if there are no classes today
        System.out.println("\n===== CLASS STATUS CHECK ===== ");
        System.out.print("Is it weekend? (true/false): ");
        boolean isWeekend = i.nextBoolean();

        System.out.print("Is it holiday? (true/false): ");
        boolean isHoliday = i.nextBoolean();

        String classStatus = (isWeekend || isHoliday) ? "Yes, no classes today" : "No, there are classes today";
        System.out.println("Are there no classes today? " + classStatus);

        // Task 4: Determine if the student passed or failed
        System.out.println("\n===== PASS OR FAIL CHECK ===== ");
        System.out.print("Enter score: ");
        int score = i.nextInt();

        String result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Student Result: " + result);

        // Task 5: Determine the larger numbe
        System.out.println("\n===== LARGER NUMBER CHECK ===== ");
        System.out.print("Enter first number: ");
        int num = i.nextInt();

        System.out.print("Enter second number: ");
        int num2 = i.nextInt();

        int larger = (num > num2) ? num : num2;
        System.out.println("The larger number is: " + larger);

        i.close();
    }
}
