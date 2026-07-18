package com.school.operators;

public class Constants {
    static final double TAX_RATE = 0.12;
    static final int PASSING_SCORE = 75;
    static final String CURRENCY = "PHP";

    public static void main(String[] args) {
        double price = 1500.00;
        double tax = price * TAX_RATE;
        double total = price + tax;
        
        System.out.println("Price: " + price + " " + CURRENCY);
        System.out.println("Tax rate: " + TAX_RATE);
        System.out.println("Tax amount: " + tax + " " + CURRENCY);
        System.out.println("Total: " + total + " " + CURRENCY);
        System.out.println("Passing score: " + PASSING_SCORE);
    }
}
