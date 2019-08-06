package com.sps.gameLogic;

import com.sps.suportClasses.figures.*;

import java.util.ArrayList;
import java.util.Random;

public class GameLogic {
    private Figure playerFigure;
    private Random randomGen = new Random();
    private ArrayList<Figure> figuresList = new ArrayList<>();


    public GameLogic(Figure figure) {
        playerFigure = figure;
        figuresList.add(new Spock());
        figuresList.add(new Lizard());
        figuresList.add(new Stone());
        figuresList.add(new Scissors());
        figuresList.add(new Paper());
    }

    public Integer roundSolver(boolean basicComputer) {
        Figure computerFigure;
        int result;
        if (basicComputer)
            computerFigure = figuresList.get(randomGen.nextInt(5));
        else {
            int computerChance = randomGen.nextInt(100);
            if (computerChance < 50)
                computerFigure = computerWinning(playerFigure);

            else if (computerChance > 50 && computerChance < 75)
                computerFigure = computerLosing(playerFigure);
            else
                computerFigure = playerFigure;
        }

        result = playerFigure.logic(computerFigure);
        System.out.println("You played: " + playerFigure.getName() + "\nComputer played: " + computerFigure.getName());
        return result;

    }

    private Figure computerWinning(Figure playerFigure) {
        if (playerFigure instanceof Stone || playerFigure instanceof Scissors)
            return new Spock();
        else if (playerFigure instanceof Spock || playerFigure instanceof Paper)
            return new Lizard();
        else
            return new Stone();
    }

    private Figure computerLosing(Figure playerFigure) {
        if (playerFigure instanceof Stone || playerFigure instanceof Spock)
            return new Scissors();
        else if (playerFigure instanceof Scissors || playerFigure instanceof Lizard)
            return new Paper();
        else
            return new Stone();
    }
}


