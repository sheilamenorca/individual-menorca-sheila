package com.joysistvi.stage2.day19;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        System.out.println("===== USER ACCOUNT REGISTRATION =====");

        System.out.print("Enter first name: ");
        String firstName = i.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = i.nextLine();

        System.out.print("Enter last name: ");
        String lastName = i.nextLine();

        System.out.print("Enter address: ");
        String address = i.nextLine();

        String email;
        while (true) {
            System.out.print("Enter email: ");
            email = i.nextLine();

            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                break;
            }
            System.out.println("Invalid email format. Please try again.");
        }

        String password;
        while (true) {
            System.out.print("Enter password: ");
            password = i.nextLine();

            if (password.length() >= 8) {
                break;
            }
            System.out.println("Password must be at least 8 characters.");
        }

        UserAccount user = new UserAccount(firstName, middleName, lastName, address, email, password);

        System.out.println("\n===== ACCOUNT INFORMATION =====");
        System.out.println("Full Name: " + user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());


        i.close();
    }
}

/*
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        Student stud = new Student();
        System.out.println("===== Student Registration =====");

        System.out.print("Enter ID number: ");
        stud.setId(i.nextInt());

        i.nextLine();

        System.out.print("Enter name: ");
        stud.setName(i.nextLine());

        System.out.print("Enter age: ");
        stud.setAge(i.nextInt());

        i.nextLine();

        System.out.print("Enter course: ");
        stud.setCourse(i.nextLine());

        System.out.print("Enter section: ");
        stud.setSection(i.nextLine());

        System.out.print("Enter address: ");
        stud.setAddress(i.nextLine());

        System.out.println("\n===== Student Profile =====");
        System.out.println("Id: " + stud.getId());
        System.out.println("Name: " + stud.getName());
        System.out.println("Age: " + stud.getAge());
        System.out.println("Course: " + stud.getCourse());
        System.out.println("Section: " + stud.getSection());
        System.out.println("Address: " + stud.getAddress());
    } */
