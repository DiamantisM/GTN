package com.Messaris;

import java.util.Scanner;

public class UserInput {

    public int userInputNumber() {
        int c = 0;
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator();
        boolean isNumber;
        boolean isValidNumber;
        do {
            System.out.print("Enter a Number 1-120: ");
            if (scan.hasNextInt()) {
                isNumber = validator.oneToOneHundredTwenty(c);
                c = scan.nextInt();
                isValidNumber = validator.oneToOneHundredTwenty(c);
            } else {
                System.out.println("I said Number...");
                isValidNumber = false;
                isNumber = false;
                scan.next();
            }
        } while (!(isNumber && isValidNumber));


        return c;
    }
}

