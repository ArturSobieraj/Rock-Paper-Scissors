package com.sps.suportClasses.figures;

public class Lizard implements Figure {
    public static String NAME = "LIZARD";

    public Integer logic(Figure figure) {
        if (figure.getName().equals(Paper.NAME) || figure.getName().equals(Spock.NAME))
            return 1;
        else if (figure.getName().equals(Scissors.NAME) || figure.getName().equals(Stone.NAME))
            return 2;
        else
            return 3;
    }

    public String getName() {
        return NAME;
    }
}
