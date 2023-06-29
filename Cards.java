package com.Company;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Cards {
    public static void main(String[] args) {
        int numberOfPlayers = 4;
        int cardsPerPlayer = 9;

        Queue<Player> playersQueue = new LinkedList<>();

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        for (int i = 1; i <= numberOfPlayers; i++) {
            Player player = new Player("Player " + i);
            Queue<Card> cards = deck.dealCards(cardsPerPlayer);
            for (Card card : cards) {
                player.addCard(card);
            }
            player.sortCardsByRank();
            playersQueue.add(player);
        }

        while (!playersQueue.isEmpty()) {
            Player player = playersQueue.poll();
            player.printCards();
        }
    }
}