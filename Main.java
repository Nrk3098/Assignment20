package com.Company;

public class Main {
    public static void main(String[] args) {
        int numberOfPlayers = 4;
        int cardsPerPlayer = 9;

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        String[][] playersCards = deck.distributeCards(numberOfPlayers, cardsPerPlayer);

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(playersCards[i][j]);
            }
            System.out.println();
        }

    }
}
