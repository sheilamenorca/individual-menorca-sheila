package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class Activity6_Menorca {
    static void main() {
        Scanner i = new Scanner(System.in);

        String email = "sheilamenorca@gmail.com";
        String password = "123456789";

        boolean isLoggedIn = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("\n===== LOG IN =====");
            System.out.print("Enter Email: ");
            String logEmail = i.nextLine();

            System.out.print("Enter Password: ");
            String logPass = i.nextLine();

            if (!logEmail.equals(email) && !logPass.equals(password)) {
                System.out.println("Invalid Email and Password!");
            } else if (!logEmail.equals(email)) {
                System.out.println("Invalid Email!");
            } else if (!logPass.equals(password)) {
                System.out.println("Invalid Password!");
            } else {
                System.out.println("Login Successful!");
                isLoggedIn = true;
                break;
            }

            if (attempt < 3) {
                System.out.println("Attempts remaining: " + (3 - attempt));
            } else {
                System.out.println("\nMaximum attempts reached! Try again later.");
            }
        }
        i.close();

    }
}
