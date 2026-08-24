package com.joysistvi.stage1.day5;

public class UnaryOperator {
    public static void main() {
        // (-) negating an expression
        int num = 10;
        System.out.println(-num);

        // (!) inverting the boolean value
        boolean isRunning = true;
        System.out.println(!isRunning);

        // increment
        int x = 0;
        System.out.println(x++);
        System.out.println(++x);

        // decrement
        System.out.println(x--);
        System.out.println(--x);
    }
}
