package com.Messaris;


public class Main {

    public static void main(String[] args) {

        int a = new NumberFactory().getRandomNumber();

        String quote;
        int b = new UserInputValidator().isValidNumber();

        if (a == b) {
            quote = new QuoteGenerator().getOmg();
        } else {
            quote = new QuoteGenerator().getNope();
        }
        System.out.println(quote + "it was " + a);
    }
}