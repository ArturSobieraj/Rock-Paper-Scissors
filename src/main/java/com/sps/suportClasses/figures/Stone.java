package com.sps.suportClasses.figures;

public class Stone implements Figure {
    public static String NAME = "STONE";

    public Integer logic(Figure figure) {
        if (figure.getName().equals(Scissors.NAME) || figure.getName().equals(Lizard.NAME))
            return 1;
        else if (figure.getName().equals(Paper.NAME) || figure.getName().equals(Spock.NAME))
            return 2;
        else
            return 3;
    }

    public String getName() {
        return NAME;
    }
}
