package com.Company;
import java.util.Arrays;
import java.util.Queue;
import java.util.Random;
class DeckOfCards {
        private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        private String[] deck;

        public DeckOfCards() {
            initializeDeck();
        }

        private void initializeDeck() {
            deck = new String[suits.length * ranks.length];
            int index = 0;

            for (String suit : suits) {
                for (String rank : ranks) {
                    deck[index] = rank + " of " + suit;
                    index++;
                }
            }
        }

        public void shuffle() {
            Random random = new Random();

            for (int i = deck.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                String temp = deck[i];
                deck[i] = deck[j];
                deck[j] = temp;
            }
        }

        public String[][] distributeCards(int numberOfPlayers, int cardsPerPlayer) {
            String[][] playersCards = new String[numberOfPlayers][cardsPerPlayer];

            int cardIndex = 0;
            for (int i = 0; i < numberOfPlayers; i++) {
                for (int j = 0; j < cardsPerPlayer; j++) {
                    playersCards[i][j] = deck[cardIndex];
                    cardIndex++;
                }
            }

            return playersCards;
        }


    public Queue<Card> dealCards(int cardsPerPlayer) {
            return null;
    }
}





