package com.joysistvi.stage1.day10;

public class SingleDimensionalArray {
    static void main() {
        String[] cars = {"Sedan", "SUV", "Pickup", "EV", "Van", "Isuzu"};

        // Invoke an element from an array
        System.out.println(cars[0]);

        // Invoke the last element
        System.out.println(cars[cars.length - 1]);

        // Get the length of an array
        System.out.println(cars.length);

        // Traverse an array using for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }

        System.out.println();

        // Traverse an array using for-each loop
        for (String car : cars) {
            System.out.print(car + " ");
        }

    }
}
