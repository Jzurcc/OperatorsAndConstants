package com.school.basics;

public class Exercise10 {
    static String schoolName = "Greenfield Academy";
    static String semester = "1st Semester, 2025-2026";
    static char passingGrade = 'D';

    public static void main(String[] args) {
        String studentName = "John Reniel Cruz";
        int studentId = 20240001;
        double mathGrade = 89.5;
        double scienceGrade = 92.0;
        double englishGrade = 85.75;
        double average = (mathGrade + scienceGrade + englishGrade) / 3.0;

        char finalGrade;
        if (average >= 90) {
            finalGrade = 'A';
        } else if (average >= 80) {
            finalGrade = 'B';
        } else if (average >= 70) {
            finalGrade = 'C';
        } else {
            finalGrade = 'F';
        }

        boolean passed = finalGrade != 'F';

        System.out.println("=============================");
        System.out.println("       REPORT CARD");
        System.out.println("=============================");
        System.out.println("School: " + schoolName);
        System.out.println("Semester: " + semester);
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println();
        System.out.println("Math:    " + mathGrade);
        System.out.println("Science: " + scienceGrade);
        System.out.println("English: " + englishGrade);
        System.out.println();
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + finalGrade);
        System.out.println("Passed: " + passed);
        System.out.println("=============================");
    }
}
