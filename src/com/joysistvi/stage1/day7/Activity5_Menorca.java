package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Menorca {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;

        System.out.println("===== SIMPLE ATM MENU =====");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
        System.out.print("Enter your choice (1-4): ");
        choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Current Balance: " + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                depositAmount = input.nextDouble();

                // Nested if validation
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Deposit successful!");
                    System.out.println("New Balance: " + balance);
                } else {
                    System.out.println("Error: Deposit amount must be greater than zero.");
                }
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                withdrawAmount = input.nextDouble();

                // Nested if validation
                if (withdrawAmount > 0) {
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                        System.out.println("New Balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance. Your current balance is: " + balance);
                    }
                } else {
                    System.out.println("Error: Withdrawal amount must be greater than zero.");
                }
                break;

            case 4:
                System.out.println("Thank you for using the Simple ATM! ");
                break;

            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 4.");
        }
        input.close();
    }
}
