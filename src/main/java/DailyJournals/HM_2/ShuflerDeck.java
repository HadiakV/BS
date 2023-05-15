package DailyJournals.HM_2;

import java.util.Random;

public class ShuflerDeck {


    public static String[] getShuffledDeck() {
        String[] deck = new String[52];
        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numberOfCards = suits.length * rank.length;
        Random random = new Random();

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i));
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }



}
