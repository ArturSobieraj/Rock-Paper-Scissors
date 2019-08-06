package com.sps.gameLogic;

import static com.sps.suportClasses.Player.getPlayersAnswer;
import static com.sps.suportClasses.Player.skan;

public class NewGame {

    private Integer numberOfRounds;
    private String name;
    private boolean basicComputer;

    public NewGame() {
        System.out.println("What is your name?");
        this.name = getPlayersAnswer();
        System.out.println("Would you like to play basic or advanced computer? \n1 - simple \n2 - advanced");
        String answer = getPlayersAnswer();
        System.out.println("How many rounds would you like to play?");
        this.numberOfRounds = skan.nextInt();
        if (answer.equals("1")) {
            this.basicComputer = true;
        } else if (answer.equals("2")) {
            this.basicComputer = false;
        }
    }

    public void showKeyBindings() {
        System.out.println("Key bindings: \n1 - stone \n2 - paper \n3 - scissors \n4 - lizard" +
                "\n5 - spock \nx - End game \nn - New Game");
    }

    public void startNewGame() {
        Gameplay gameplay = new Gameplay(numberOfRounds, basicComputer);
        gameplay.play();
    }
}
