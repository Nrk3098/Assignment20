package com.Company;

import java.util.ArrayList;
import java.util.List;

public class StockAccount1 {

        private String accountName;
        private List<CompanyShares> sharesList;

        public StockAccount1(String accountName, int numberOfShares, double sharePrice) {
            this.accountName = accountName;
            this.sharesList = new ArrayList<>();
        }

        public void buyShares(String stockSymbol, int numberOfShares, String transactionDateTime) {
            CompanyShares shares = findSharesBySymbol(stockSymbol);
            if (shares != null) {
                // Update existing shares
                shares.numberOfShares += numberOfShares;
            } else {
                // Create new shares
                sharesList.add(new CompanyShares(stockSymbol, numberOfShares, transactionDateTime));
            }
        }

        public void sellShares(String stockSymbol, int numberOfShares, String transactionDateTime) {
            CompanyShares shares = findSharesBySymbol(stockSymbol);
            if (shares != null) {
                if (numberOfShares <= shares.numberOfShares) {
                    // Sell shares
                    shares.numberOfShares -= numberOfShares;
                    if (shares.numberOfShares == 0) {
                        // Remove shares if all are sold
                        sharesList.remove(shares);
                    }
                } else {
                    System.out.println("Insufficient shares available for selling.");
                }
            } else {
                System.out.println("No shares found for the given stock symbol.");
            }
        }

        public void displayShares() {
            System.out.println("Stock Account: " + accountName);
            for (CompanyShares shares : sharesList) {
                System.out.println("Stock Symbol: " + shares.getStockSymbol());
                System.out.println("Number of Shares: " + shares.getNumberOfShares());
                System.out.println("Transaction Date/Time: " + shares.getTransactionDateTime());
                System.out.println();
            }
        }

        private CompanyShares findSharesBySymbol(String stockSymbol) {
            for (CompanyShares shares : sharesList) {
                if (shares.getStockSymbol().equals(stockSymbol)) {
                    return shares;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            int numberOfShares=0;
            double sharePrice=0;
            com.Company.StockAccount1 stockAccount = new com.Company.StockAccount1(" Stock Account", numberOfShares, sharePrice);

            // Buy shares
            stockAccount.buyShares("ap@3", 10, "2023-06-01 09:30:00");
            stockAccount.buyShares("34AD", 5, "2023-06-02 14:15:00");
            stockAccount.buyShares("CHUI", 7, "2023-06-03 11:45:00");

            // Sell shares
            stockAccount.sellShares("nmsd", 3, "2023-06-04 10:00:00");
            stockAccount.sellShares("NKb7", 2, "2023-06-05 16:30:00");

            // Display shares
            stockAccount.displayShares();
        }
    }


