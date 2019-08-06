package com.sps.suportClasses.figures;

public class Paper implements Figure {
    public static String NAME = "PAPER";

    public Integer logic(Figure figure) {
        if (figure.getName().equals(Spock.NAME) || figure.getName().equals(Stone.NAME))
            return 1;
        else if (figure.getName().equals(Scissors.NAME) || figure.getName().equals(Lizard.NAME))
            return 2;
        else
            return 3;
    }

    public String getName() {
        return NAME;
    }
}
