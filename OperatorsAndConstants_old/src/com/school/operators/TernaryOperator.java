package com.school.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 17;
        int score = 82;
        int temperature = 30;
        
        String category = (age >= 18) ? "Adult" : "Minor";
        String result = (score >= 75) ? "Passed" : "Failed";
        String weather = (temperature >= 30) ? "Hot" : "Cool";
        
        System.out.println("Age 17: " + category);
        System.out.println("Score 82: " + result);
        System.out.println("Temperature 30: " + weather);
    }
}
