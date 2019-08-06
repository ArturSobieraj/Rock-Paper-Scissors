package com.sps.Main;

import com.sps.gameLogic.NewGame;

public class Main {

    public static void main(String[] args) {
        boolean end = false;
        while (!end) {
            NewGame newGame = new NewGame();
            newGame.showKeyBindings();
            newGame.startNewGame();
        }
    }
}
