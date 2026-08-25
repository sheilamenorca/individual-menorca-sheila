package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class IfStatement {
    static void main() {

        Scanner i = new Scanner(System.in);

        // simple if-statement

        /*float temp = 0.0f;
        String result = "";
        if (temp > 36.6) {
            System.out.println("try");
            result = "fever";
        } else {
            result = "Normal temp";
        }

        System.out.println("result");
        */


        System.out.print("Enter day: ");
        int day = i.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Input!");
        }

    }
}
