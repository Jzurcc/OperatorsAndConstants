package com.school.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        System.out.println("12 & 10 = " + (a & b));
        System.out.println("12 | 10 = " + (a | b));
        System.out.println("12 ^ 10 = " + (a ^ b));
        System.out.println("~12 = " + (~a));
        System.out.println("12 << 2 = " + (a << 2));
        System.out.println("12 >> 2 = " + (a >> 2));
    }
}
