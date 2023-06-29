package com.Company;
import java.util.ArrayList;
import java.util.List;
class CompanyShares {
        private String stockSymbol;
        int numberOfShares;
        private String transactionDateTime;

        public CompanyShares(String stockSymbol, int numberOfShares, String transactionDateTime) {
            this.stockSymbol = stockSymbol;
            this.numberOfShares = numberOfShares;
            this.transactionDateTime = transactionDateTime;
        }

        public String getStockSymbol() {
            return stockSymbol;
        }

        public int getNumberOfShares() {
            return numberOfShares;
        }

        public String getTransactionDateTime() {
            return transactionDateTime;
        }
    }



