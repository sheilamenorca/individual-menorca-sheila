package com.joysistvi.stage1.day4;

public class Activity2_Menorca {
    public static void main(String[] args) {
        // given values
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        System.out.println("Income: " + income);
        // percentage of food allowance relative to the total income
        double percentageFood = foodAllowance / income * 100;
        System.out.printf("Food Allowance: %.1f %%", percentageFood);

        // percentage of transportation relative to the total income
        double percentageTranspo = transportation / income * 100;
        System.out.printf("\nTransportation: %.1f %%", percentageTranspo);

        // percentage of rent relative to the total income
        double percentageRent = rent / income * 100;
        System.out.printf("\nRent: %.1f %%", percentageRent);

        // percentage of utility bill relative to the total income
        double percentageUtility = utilityBill / income * 100;
        System.out.printf("\nUtility Bill: %.1f %%", percentageUtility);

        // remaining balance
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double balance = income - totalExpenses;
        System.out.println("\nRemaining Balance: " + balance);



    }
}
