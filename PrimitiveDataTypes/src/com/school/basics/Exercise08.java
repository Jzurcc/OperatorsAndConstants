package com.school.basics;

public class Exercise08 {
    public static void main(String[] args) {
        int myInt = 100;
        double myDouble = myInt;

        double price = 9.99;
        int wholePrice = (int) price;

        char letter = 'Z';
        int asciiValue = letter;

        System.out.println("int value: " + myInt + " → double value: " + myDouble);
        System.out.println("double value: " + price + " → int value: " + wholePrice);
        System.out.println("char value: " + letter + " → ASCII value: " + asciiValue);
    }
}
