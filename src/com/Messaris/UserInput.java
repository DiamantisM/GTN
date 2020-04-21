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
                isNumber = validator.isNumber(scan);
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

    public int userInputGame() {
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        boolean isValidNumber;
        boolean isOneOrTwo;
        do {
            System.out.println("Choose game: \n 1.Random Number Everytime \n 2.Random Number Once");
            if (scanner.hasNextInt()) {
                isValidNumber = validator.isNumber(scanner);
                a = scanner.nextInt();
                isOneOrTwo = validator.isOneOrTwo(a);
            } else {
                System.out.println("Type  1 or 2 plz ");
                isValidNumber = false;
                isOneOrTwo = false;
                scanner.next();
            }
        } while (!(isOneOrTwo && isValidNumber));

        return a;
    }
}

