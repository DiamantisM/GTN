package com.Messaris;

public class GuessTheNumber {

    public String returnQuote() {
        int a = new NumberFactory().getRandomNumber();
        int b = new UserInput().userInputNumber();
        QuoteGenerator quoteGenerator = new QuoteGenerator();
        String z;
        if (a == b) {
            z = quoteGenerator.getOmg();
        } else {
            z = quoteGenerator.getNope();
        }
        return z + a;


    }
}
