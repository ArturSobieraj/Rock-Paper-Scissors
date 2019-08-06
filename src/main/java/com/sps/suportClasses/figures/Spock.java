package com.sps.suportClasses.figures;

public class Spock implements Figure {
    public static String NAME = "SPOCK";

    public Integer logic(Figure figure) {
        if (figure.getName().equals(Scissors.NAME) || figure.getName().equals(Stone.NAME))
            return 1;
        else if (figure.getName().equals(Lizard.NAME) || figure.getName().equals(Paper.NAME))
            return 2;
        else
            return 3;
    }

    public String getName() {
        return NAME;
    }
}
