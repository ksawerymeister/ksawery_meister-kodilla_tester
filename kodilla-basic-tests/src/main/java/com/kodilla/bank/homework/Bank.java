package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab,
                0, cashMachines.length);
        newTab[size-1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int generalBalance() {
        int generalSum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            generalSum += cashMachines[i].balance();
        }
        return generalSum;
    }

    public boolean isPaymentPositive(int indexOfCM, int indexOfT) {
        if (cashMachines[indexOfCM].getTransactions()[indexOfT] > 0) {
            return true;
        }
        return false;
    }

    public int negativePaymentsCounter() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            for (int j = 0; j < cashMachines[i].getTransactions().length; j++) {
                if (!isPaymentPositive(i, j)) {
                    sum++;
                }
            }
        }
        return sum;
    }
    public int positivePaymentsCounter() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            for (int j = 0; j < cashMachines[i].getTransactions().length; j++) {
                if (isPaymentPositive(i, j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public double negativePaymentsAverage() {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            for (int j = 0; j < cashMachines[i].getTransactions().length; j++) {
                if (!isPaymentPositive(i, j)) {
                    sum+= cashMachines[i].getTransactions()[j];
                    counter++;
                }
            }
        }
        return (double)sum/counter;
    }
    public double positivePaymentsAverage() {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            for (int j = 0; j < cashMachines[i].getTransactions().length; j++) {
                if (isPaymentPositive(i, j)) {
                    sum+= cashMachines[i].getTransactions()[j];
                    counter++;
                }
            }
        }
        return (double) sum/counter;
    }




}
