package com.Messaris;

public class Scanner {

    public int UserInputNumber() {
        int c = 0;
        boolean isNumber;
        boolean isValidNumber;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        do {
            System.out.print("Enter a Number 1-120: ");
            if (scan.hasNextInt()) {
                isNumber = new Validator().isNumber(scan);
                c = scan.nextInt();
                isValidNumber = new Validator().oneToOneHandredTwenty(c);
            } else {
                System.out.println("Invalid entry !! ");
                isValidNumber = false;
                isNumber = false;
                scan.next();
            }
        } while (!(isNumber && isValidNumber));


        return c;
    }
}

