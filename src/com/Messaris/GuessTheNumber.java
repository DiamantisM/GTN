package com.Messaris;

public class GuessTheNumber {

    public void playTheGame() {
        boolean areEqual;
        do {
            String a = new QuoteGenerator().returnQuote();
            areEqual = a.contains("OMG");
            System.out.println(a);
        } while (!(areEqual));
    }


}
