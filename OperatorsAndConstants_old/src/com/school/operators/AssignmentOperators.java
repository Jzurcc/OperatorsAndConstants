package com.school.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int score = 100;
        System.out.println("Initial score: " + score);
        score += 10;
        System.out.println("After += 10: " + score);
        score -= 25;
        System.out.println("After -= 25: " + score);
        score *= 2;
        System.out.println("After *= 2: " + score);
        score /= 5;
        System.out.println("After /= 5: " + score);
        score %= 7;
        System.out.println("After %= 7: " + score);
    }
}
