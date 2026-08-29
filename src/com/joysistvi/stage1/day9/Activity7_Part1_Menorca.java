package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_Part1_Menorca {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int num = sc.nextInt();

        System.out.println("\n=================================");
        System.out.println("\tMultiplication Table of " + num);
        System.out.println("=================================");

        for (int i = 1; i <= 10; i++) {
            System.out.println("\t" + num + " x " + i + " = " + (num * i));
        }

        sc.close();

    }
}
