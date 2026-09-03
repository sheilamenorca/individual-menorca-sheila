package com.joysistvi.stage1.day11;

public class Activity10_Menorca {
    static void main() {
        String country = "Philippines";

        // First character
        char firstCharacter = country.charAt(0);

        // Last character
        char lastCharacter = country.charAt(country.length() - 1);

        System.out.println("Country: " + country);
        System.out.println("First character: " + firstCharacter);
        System.out.println("Last character: " + lastCharacter);

        // Count P/p
        int pCount = 0;

        // Count vowels
        int vowelCount = 0;

        for (char character : country.toCharArray()) {

            // Count P or p
            if (character == 'P' || character == 'p') {
                pCount++;
            }

            // Count vowels
            if (character == 'a' || character == 'e' ||
                    character == 'i' || character == 'o' ||
                    character == 'u' || character == 'A' ||
                    character == 'E' || character == 'I' ||
                    character == 'O' || character == 'U') {

                vowelCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);
        System.out.println("Total number of vowels: " + vowelCount);
    }
}
