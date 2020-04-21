package com.Messaris;

public class GuessTheNumber {

    public void randomNumberEveryTime() {
        boolean areEqual;
        do {
            String a = new QuoteGenerator().returnQuoteEveryTime();
            areEqual = a.contains("OMG");
            System.out.println(a);
        } while (!(areEqual));
    }


    public void randomNumberOnce() {
        NumberFactory numberFactory = new NumberFactory();
        int randomNumber = numberFactory.getRandomNumber();
        boolean areEqual;
        do {
            String a = new QuoteGenerator().returnQuoteOnce(randomNumber);
            areEqual = a.contains("YES");
            System.out.println(a);
        } while (!(areEqual));
    }


}
