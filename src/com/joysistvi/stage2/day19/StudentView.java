package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class StudentView {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Student stud = new Student(12345, "Sheila", 26, "BSIT", "Diamond", "Taguig City");

        System.out.println("\n===== Student Profile =====");
        System.out.println("Id: " + stud.getId());
        System.out.println("Name: " + stud.getName());
        System.out.println("Age: " + stud.getAge());
        System.out.println("Course: " + stud.getCourse());
        System.out.println("Section: " + stud.getSection());
        System.out.println("Address: " + stud.getAddress());

    }
}
