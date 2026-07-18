package com.school.basics;

public class Exercise09 {
    static final double PI = 3.14159;
    static final int MAX_STUDENTS = 40;
    static final char PASSING_GRADE = 'C';
    static final String SCHOOL_MOTTO = "Learn. Grow. Succeed.";

    public static void main(String[] args) {
        double radius = 5.0;
        double area = PI * radius * radius;

        System.out.println("PI: " + PI);
        System.out.println("Max students: " + MAX_STUDENTS);
        System.out.println("Passing grade: " + PASSING_GRADE);
        System.out.println("Motto: " + SCHOOL_MOTTO);
        System.out.println("Area of circle with radius 5.0: " + area);
    }
}
