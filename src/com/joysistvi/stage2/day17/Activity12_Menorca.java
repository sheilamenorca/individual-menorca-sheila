package com.joysistvi.stage2.day17;

import java.util.Scanner;

public class Activity12_Menorca {

    static Scanner scanner = new Scanner(System.in);

    static void oddEven() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is Even.");
        else
            System.out.println(number + " is Odd.");
    }

    static void printName() {
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + name);
        }
    }

    static void squareRoot() {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.println("Square root: " + Math.sqrt(number));
    }

    static void power() {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();

        System.out.println("Answer: " + Math.pow(base, exponent));
    }

    static void randomNumber() {
        int number = (int)(Math.random() * 100) + 1;

        System.out.println("Random number: " + number);
    }

    static void circleArea() {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle: " + area);
    }

    static void voter() {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18)
            System.out.println("You are a voter.");
        else
            System.out.println("You are not a voter.");
    }

    static void wordLength() {
        scanner.nextLine();

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("Length: " + word.length());
    }

    static void reverseWord() {
        scanner.nextLine();

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        System.out.println("Reverse: " + reverse);
    }

    static void fullNameAndAge() {
        System.out.println("Full Name: Sheila Menorca");
        System.out.println("Age: 20");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== SELECT METHOD =====");
            System.out.println("1. Odd or Even");
            System.out.println("2. Print Name 50 Times");
            System.out.println("3. Square Root");
            System.out.println("4. Power of a Number");
            System.out.println("5. Random Number");
            System.out.println("6. Area of a Circle");
            System.out.println("7. Voter Checker");
            System.out.println("8. Word Length");
            System.out.println("9. Reverse Word");
            System.out.println("10. Full Name and Age");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    oddEven();
                    break;
                case 2:
                    printName();
                    break;
                case 3:
                    squareRoot();
                    break;
                case 4:
                    power();
                    break;
                case 5:
                    randomNumber();
                    break;
                case 6:
                    circleArea();
                    break;
                case 7:
                    voter();
                    break;
                case 8:
                    wordLength();
                    break;
                case 9:
                    reverseWord();
                    break;
                case 10:
                    fullNameAndAge();
                    break;
                case 0:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

