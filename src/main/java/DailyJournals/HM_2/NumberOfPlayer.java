package main.java.DailyJournals.HM_2;

import java.util.Scanner;

public class NumberOfPlayer {
    public static int getNumberOfPlayers(int cardsForPlayer) {
        final int numberOfCards = 52;
        Scanner sc = new Scanner(System.in);
        int players;

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        System.exit(0);
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
                sc.next();
            }
        }
        return players;
    }




}
