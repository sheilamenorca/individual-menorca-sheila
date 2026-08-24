package com.joysistvi.stage1.day5;

public class TernaryOperator {
    public static void main() {
        // (condition) ? true block : false block

        // identifies if a number is positive or negatie
        int num = 0;
        String numberType = (num > 0) ? "Positive" : "Negative";
        System.out.println(numberType + " Number");

        // identifies if a number is an even or odd number
        int num2 = 201;
        String numberCategory = num2 % 2 == 0 ? "Even" : "Odd";
        System.out.println(numberCategory + " Number");

    }
}
