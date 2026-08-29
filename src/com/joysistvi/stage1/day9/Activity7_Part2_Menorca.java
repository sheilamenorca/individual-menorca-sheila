package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_Part2_Menorca {
    static void main() {
        Scanner sc = new Scanner(System.in);

        for (int num = 1; num <= 10; num++) {
            System.out.println("\n=================================");
            System.out.println("\tMultiplication Table of " + num);
            System.out.println("=================================");

            for (int i = 1; i <= 10; i++) {
                System.out.println("\t" + num + " x " + i + " = " + (num * i));
            }
        }
        sc.close();

    }
}
