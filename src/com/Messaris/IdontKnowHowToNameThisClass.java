package com.Messaris;

public class IdontKnowHowToNameThisClass {

    int a = new NumberFactory().getRandomNumber();
    int b = new Scanner().UserInputNumber();
    String z;


    public String returnQuote() {
        if (a == b) {
            z = new QuoteGenerator().getOmg();
        } else {
            z = new QuoteGenerator().getNope();
        }
        return z + a;


    }
}
