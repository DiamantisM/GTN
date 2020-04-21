package com.Messaris;

/**
 * Generates and returns a quote in English.
 */
public class QuoteGenerator {

    private String getHot() {
        return "HOT HOT HOT !!!";
    }

    private String getCold() {
        return "Brrrrr COLD !!";
    }

    private String getWin() {
        return "YES you won !!!!!!!!!!";
    }

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


    public String returnQuoteOnce(int a) {
        UserInput userInput = new UserInput();
        QuoteGenerator quoteGenerator = new QuoteGenerator();
        int b = userInput.userInputNumber();
        int c = Math.abs(a - b);
        String z;
        if (c == 0) {
            z = quoteGenerator.getWin();
        } else if (c > 0 && c < 10) {
            z = quoteGenerator.getHot();
        } else {
            z = quoteGenerator.getCold();
        }
        return z;

    }

    public String returnQuoteEveryTime() {
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