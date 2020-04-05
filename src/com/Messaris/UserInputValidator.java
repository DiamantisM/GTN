package com.Messaris;

import java.util.Scanner;

public class UserInputValidator {
    int b;
    boolean isNumber;
    Scanner scan = new Scanner(System.in);

    public int isValidNumber() {

        do {
            System.out.print("Enter a Number 1-120:  ");

            if (scan.hasNextInt()) {
                b = scan.nextInt();
                isNumber = true;
            } else {
                System.out.print("Not a Number,plz ");
                isNumber = false;
                scan.next();

            }

        } while (!(isNumber));
        return b;
    }
}