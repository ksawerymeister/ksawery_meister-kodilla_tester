package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {

    private String nameOfCashMachine;
    private int[] transactions;
    private int size;


    public CashMachine(String nameOfCashMachine) {
        this.nameOfCashMachine = nameOfCashMachine;
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int value) {
        if (value != 0) {
            this.size++;
            transactionsCounter(value);
            int[] newTab = new int[this.size];
            System.arraycopy(transactions, 0, newTab,
                    0, transactions.length);
            newTab[size - 1] = value;
            this.transactions = newTab;
        }
    }

    public void transactionsCounter(int value) {
        System.out.println("transaction number: " + this.size);
        System.out.println("Dokonano " + (value > 0 ? "wpłaty" : "wypłaty"));
    }

    public int balance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += transactions[i];
        }
        return sum;
    }

    public int[] getTransactions() {
        return transactions;
    }


}
