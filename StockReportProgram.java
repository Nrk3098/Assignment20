package com.Company;

import java.util.Scanner;

public class StockReportProgram {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StockPortfolio portfolio = new StockPortfolio();

            System.out.print("Enter the number of stocks: ");
            int numberOfStocks = scanner.nextInt();
        scanner.nextLine();

            for (int i = 1; i <= numberOfStocks; i++) {
                System.out.println("Stock " + i + ":");
                System.out.print("Enter the stock name: ");
                String name = scanner.nextLine();
                System.out.print("Enter the number of shares: ");
                int numberOfShares = scanner.nextInt();
                System.out.print("Enter the share price: ");
                double sharePrice = scanner.nextDouble();
                scanner.nextLine();

                StockAccount stock = new StockAccount(name, numberOfShares, sharePrice);
                portfolio.addStock(stock);
                System.out.println();
            }

            portfolio.printStockReport();
        }
}
