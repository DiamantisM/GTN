package com.Messaris;

public class NumberFactory {

    public int number() {
        int a = new DiceRoller().sixDice();
        int b = new DiceRoller().twentyDice();
        return a * b;
    }
}

