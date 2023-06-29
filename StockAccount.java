package com.Company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 class StockAccount {

        private String name;
        private int numberOfShares;
        private double sharePrice;

        public StockAccount(String name, int numberOfShares, double sharePrice) {
            this.name = name;
            this.numberOfShares = numberOfShares;
            this.sharePrice = sharePrice;
        }

        public double calculateValue() {
            return numberOfShares * sharePrice;
        }

        public String getName() {
            return name;
        }

        public int getNumberOfShares() {
            return numberOfShares;
        }

        public double getSharePrice() {
            return sharePrice;
        }
    }

    class StockPortfolio {
        private List<StockAccount> stocks;

        public StockPortfolio() {
            stocks = new ArrayList<>();
        }

        public void addStock(StockAccount stock) {
            stocks.add(stock);
        }

        public double calculateTotalValue() {
            double totalValue = 0.0;
            for (StockAccount stock : stocks) {
                totalValue += stock.calculateValue();
            }
            return totalValue;
        }

        public void printStockReport() {
            System.out.println("Stock Report:");
            for (StockAccount stock : stocks) {
                System.out.println("Stock Name: " + stock.getName());
                System.out.println("Number of Shares: " + stock.getNumberOfShares());
                System.out.println("Share Price: $" + stock.getSharePrice());
                System.out.println("Stock Value: $" + stock.calculateValue());
                System.out.println();
            }
            System.out.println("Total Stock Value: $" + calculateTotalValue());
        }
    }





