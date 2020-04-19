package com.Messaris;

public class NumberFactory {

    public int getRandomNumber() {

        DiceRoller diceRoller = new DiceRoller();

        int a = diceRoller.getSixSidedDieRoll();
        int b = diceRoller.getTwentySidedDieRoll();
        return a * b;
    }
}
