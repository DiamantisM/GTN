package com.Messaris;

import java.util.Random;

public class DiceRoller {

    public int sixDice() {
        Random random = new Random();
        int uber = random.nextInt(6);
        return uber+1;


    }

    public int twentyDice(){
        Random random = new Random();
        int uber = random.nextInt(20);
        return uber+1;
    }
}
