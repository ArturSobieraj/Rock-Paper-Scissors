package com.sps.gameLogic;

import com.sps.suportClasses.figures.Figure;
import com.sps.suportClasses.figures.*;

import static com.sps.suportClasses.Player.getPlayersAnswer;

public class Gameplay {
    private int numberOfRounds;
    private boolean basicComputer;
    private boolean end;
    private Figure playerFigure;

    public Gameplay(int numberOfRounds, boolean basicComputer) {
        this.numberOfRounds = numberOfRounds;
        this.basicComputer = basicComputer;
    }

    public void play() {
        end = false;
        int playersWins = 0;
        int computerWins = 0;
        int roundNumber = 0;
        String playerAnswer = getPlayersAnswer();
        if (playerAnswer.equals("x")) {
            gameEnd();
        } else if (playerAnswer.equals("n")) {
            end = startNewGameStatement();
        } else
        figureChooser(playerAnswer);

        while (!end) {
            System.out.println("\nChoose your figure");
            playerAnswer = getPlayersAnswer();
            if (playerAnswer.equals("x")) {
                gameEnd();
                continue;
            } else if (playerAnswer.equals("n")) {
                end = startNewGameStatement();
                continue;
            } else
                figureChooser(playerAnswer);

            GameLogic gameLogic = new GameLogic(playerFigure);
            int roundResult = gameLogic.roundSolver(basicComputer);
            if (roundResult == 1) {
                playersWins++;
                System.out.println("You have won");
            } else if (roundResult == 2) {
                computerWins++;
                System.out.println("Computer have won");
            } else
                System.out.println("This round is draw");
            roundNumber++;
            if (roundNumber == numberOfRounds) {
                System.out.println("Your wins: " + playersWins + "\nComputer wins: " + computerWins);
                if (playersWins > computerWins)
                    System.out.println("You have won!");
                else if (playersWins < computerWins)
                    System.out.println("Computer have won!");
                else
                    System.out.println("Draw!");
                end = true;
                System.out.println("Would you like to play another game? \n1 - yes \n2 - no");
                if (getPlayersAnswer().equals("2"))
                    System.exit(0);
            }
        }
    }

    private void figureChooser(String playerAnswer) {
        switch (playerAnswer) {
            case "1":
                playerFigure = new Stone();
                break;
            case "2":
                playerFigure = new Paper();
                break;
            case "3":
                playerFigure = new Scissors();
                break;
            case "4":
                playerFigure = new Lizard();
                break;
            case "5":
                playerFigure = new Spock();
                break;
        }
    }

    private void gameEnd() {
        System.out.println("Are you sure you want exit game? \n1 - yes \n2 - no");
        if (getPlayersAnswer().equals("1")) {
            System.exit(0);
        }
    }

    private boolean startNewGameStatement() {
        System.out.println("Are you sure you want start new game? \n1 - yes \n2 - no");
        return (getPlayersAnswer().equals("1"));
    }
}
