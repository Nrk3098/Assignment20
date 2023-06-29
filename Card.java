package com.Company;
import java.util.*;

   class Card {
        private String suit;
        private String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public String getSuit() {
            return suit;
        }

        public String getRank() {
            return rank;
        }

        public String toString() {
            return rank + " of " + suit;
        }
    }

    class Player {
        private String name;
        private Queue<Card> cards;

        public Player(String name) {
            this.name = name;
            this.cards = new LinkedList<>();
        }

        public void addCard(Card card) {
            cards.add(card);
        }

        public void sortCardsByRank() {
            List<Card> cardList = new ArrayList<>(cards);
            cardList.sort(Comparator.comparing(Card::getRank));
            cards = new LinkedList<>(cardList);
        }

        public void printCards() {
            System.out.println("Player: " + name);
            for (Card card : cards) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    class DeckOfCards1 {
        private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        private List<Card> deck;

        public DeckOfCards1() {
            initializeDeck();
        }

        private void initializeDeck() {
            deck = new ArrayList<>();

            for (String suit : suits) {
                for (String rank : ranks) {
                    Card card = new Card(suit, rank);
                    deck.add(card);
                }
            }
        }

        public void shuffle() {
            Collections.shuffle(deck);
        }

        public Queue<Card> dealCards(int numberOfCards) {
            Queue<Card> cards = new LinkedList<>();

            for (int i = 0; i < numberOfCards; i++) {
                cards.add(deck.remove(0));
            }

            return cards;
        }


        }



