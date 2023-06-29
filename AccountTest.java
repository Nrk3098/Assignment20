package com.Company;


    class Account {
        private double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void debit(double amount) {
            if (amount > balance) {
                System.out.println("Debit amount exceeded account balance.");
            } else {
                balance -= amount;
                System.out.println("Debit of $" + amount + " successful.");
            }
        }
    }

    public class AccountTest {
        public static void main(String[] args) {
            Account account = new Account(5000.0);

            System.out.println("Initial account balance: $" + account.getBalance());

            double debitAmount = 1000.0;
            System.out.println("Debit amount: $" + debitAmount);
            account.debit(debitAmount);
            System.out.println("Current account balance: $" + account.getBalance());

            debitAmount = 2000.0;
            System.out.println("Debit amount: $" + debitAmount);
            account.debit(debitAmount);
            System.out.println("Current account balance: $" + account.getBalance());
        }
    }


