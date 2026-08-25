package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_If_Menorca {
    public static void main() {
        Scanner i = new Scanner(System.in);

        // Game Menu
        System.out.println("=== MAIN MENU ===");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        int choice = i.nextInt();

        if (choice == 1) {
            System.out.println("\nYou selected Option 1: Start Game");
        } else if (choice == 2) {
            System.out.println("\nYou selected Option 2: Load Game");
        } else if (choice == 3) {
            System.out.println("\nYou selected Option 3: Settings");
        } else if (choice == 4) {
            System.out.println("\nYou selected Option 4: Exit");
        } else {
            System.out.println("\nInvalid choice. Please try again.");
        }

        i.close();

    }

}
