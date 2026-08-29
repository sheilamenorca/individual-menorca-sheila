package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class Activity8_Menorca {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++){
            System.out.print("Number " + (i+1) + ": ");
            num[i] = sc.nextInt();
            sum += num[i];
        }

        System.out.println("\nYou entered:");
        for(int i = 0; i < 5; i++){
            System.out.println("Index " + i + ": " + num[i]);
        }

        System.out.println("\nSum: " + sum);

        double average = sum/num.length;
        System.out.println("Average: " + average);

        int highest = num[0];
        int lowest = num[0];

        for (int number: num) {
            if (number > highest) {
                highest = number;
            }
            if (number < lowest) {
                lowest = number;
            }
        }

        System.out.println("Highest number = " + highest);
        System.out.println("Lowest number = " + lowest);

        sc.close();
    }
}
