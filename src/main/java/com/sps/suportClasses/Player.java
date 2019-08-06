package com.sps.suportClasses;

import java.util.Scanner;

public class Player {

    public static Scanner skan = new Scanner(System.in);

    public static String getPlayersAnswer() {
        String playersAnswer = skan.nextLine();
        return playersAnswer;
    }
}
