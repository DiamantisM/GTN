package com.Messaris;

/**
 * Generates and returns a quote in English.
 */
public class QuoteGenerator {

    private String getLol() {
        return "lol not so close,it was: ";
    }

    private String getRofl() {
        return "ROFL you Suck at guessing,it was: ";
    }

    private String getOmg() {
        return "OMG YOU WON it was: ";
    }

    private String getClose() {
        return "That was close,it was: ";
    }

    public String returnQuote() {
        NumberFactory numberFactory = new NumberFactory();
        UserInput userInput = new UserInput();
        QuoteGenerator quoteGenerator = new QuoteGenerator();
        int a = numberFactory.getRandomNumber();
        int b = userInput.userInputNumber();
        int c = Math.abs(a - b);
        String z;
        if (c == 0) {
            z = quoteGenerator.getOmg();
        } else if (c > 0 && c < 11) {
            z = quoteGenerator.getClose();
        } else if (c > 10 && c < 80) {
            z = quoteGenerator.getLol();
        } else {
            z = quoteGenerator.getRofl();
        }
        return z + a;


    }

}