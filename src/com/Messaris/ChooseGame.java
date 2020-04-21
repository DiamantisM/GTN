package com.Messaris;

public class ChooseGame {

    public void StartGame() {
        UserInput userInput = new UserInput();
        int a = userInput.userInputGame();
        if (a == 1) {
            new GuessTheNumber().randomNumberEveryTime();

        } else {
            new GuessTheNumber().randomNumberOnce();
        }
    }


}
