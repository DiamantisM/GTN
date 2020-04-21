package com.Messaris;

/**
 * Generates and returns a quote in English.
 */
public class QuoteGenerator {

    private String getLol(String targetNumber) {
        String message = "lol not so close,it was: %s!";
        message = String.format(message, targetNumber);
        return message;
    }

    private String getRofl(String targetNumber) {
        String message = "ROFL you Suck at guessing,it was: %s";
        message = String.format(message, targetNumber);
        return message;
    }

    private String getOmg(String targetNumber) {
        String message = "OMG YOU WON it was: %s";
        message = String.format(message, targetNumber);
        return message;
    }

    private String getClose(String targetNumber) {
        String message = "That was Close,it was: %s";
        message = String.format(message, targetNumber);
        return message;
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
            z = quoteGenerator.getOmg(String.valueOf(a));
        } else if (c > 0 && c < 11) {
            z = quoteGenerator.getClose(String.valueOf(a));
        } else if (c > 10 && c < 80) {
            z = quoteGenerator.getLol(String.valueOf(a));
        } else {
            z = quoteGenerator.getRofl(String.valueOf(a));
        }
        return z;


    }

}