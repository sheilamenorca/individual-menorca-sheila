package com.joysistvi.stage1.day12;

import java.util.Scanner;

public class Activity11_Menorca {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        // 2. Math.max()
        // Returns the larger value between two numbers.

        System.out.print("Enter first number: ");
        int num1 = i.nextInt();

        System.out.print("Enter second number: ");
        int num2 = i.nextInt();

        System.out.print("The larger number is: " + Math.max(num1, num2));



    }
}
