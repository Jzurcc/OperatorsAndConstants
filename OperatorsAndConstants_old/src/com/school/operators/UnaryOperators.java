package com.school.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = 10;
        boolean isActive = false;
        System.out.println("Unary plus: +10 = " + (+x));
        System.out.println("Unary minus: -10 = " + (-x));
        System.out.println("Pre-increment: ++x = " + (++x) + ", x is now " + x);
        System.out.println("Post-increment: x++ = " + (x++) + ", x is now " + x);
        System.out.println("Pre-decrement: --x = " + (--x) + ", x is now " + x);
        System.out.println("Post-decrement: x-- = " + (x--) + ", x is now " + x);
        System.out.println("NOT isActive: " + (!isActive));
    }
}
