package com.Messaris;

import java.util.Scanner;

public class Validator {

    public boolean oneToOneHundredTwenty(int x) {
        boolean isValid;
        isValid = x > 0 && x < 121;
        return isValid;
    }

    public boolean isNumber(Scanner x) {
        boolean isValid;
        isValid = x.hasNextInt();
        return isValid;
    }

    public boolean isOneOrTwo(int x) {
        boolean isValid;
        isValid = x == 1 || x == 2;
        return isValid;
    }
}

