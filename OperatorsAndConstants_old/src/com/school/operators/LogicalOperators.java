package com.school.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean hasID = true;
        boolean hasTicket = false;
        boolean isVIP = true;
        System.out.println("hasID && hasTicket: " + (hasID && hasTicket));
        System.out.println("hasID || hasTicket: " + (hasID || hasTicket));
        System.out.println("!hasTicket: " + (!hasTicket));
        System.out.println("(hasID && hasTicket) || isVIP: " + ((hasID && hasTicket) || isVIP));
        System.out.println("!(hasID && isVIP): " + (!(hasID && isVIP)));
    }
}
