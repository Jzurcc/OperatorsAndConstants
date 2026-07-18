package com.school.basics;

public class Exercise06 {
    static String appName = "StudentTracker";
    static int version = 1;

    public static void main(String[] args) {
        String userName = "Admin";
        boolean isLoggedIn = true;

        System.out.println("[static] App name: " + appName);
        System.out.println("[static] Version: " + version);
        System.out.println("[local] User: " + userName);
        System.out.println("[local] Logged in: " + isLoggedIn);
    }
}
