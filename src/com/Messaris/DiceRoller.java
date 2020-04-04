package com.Messaris;

import java.util.Random;

public class DiceRoller {

    private static final int DIX_SIX_SIDED = 6;
    private static final int DIX_TWENTY_SIDED = 20;

    public int getSixSidedDieRoll() {
        return getRandomNumber(DIX_SIX_SIDED) + 1;
    }

    public int getTwentySidedDieRoll() {
        return getRandomNumber(DIX_TWENTY_SIDED) + 1;
    }

    private int getRandomNumber(int max) {
        return new Random().nextInt(max);
    }

}
