package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {



    private Bank bank1;
    private Bank bank2;
    private Bank bank3;


    @BeforeEach
    public void starter(){
        CashMachine cashMachine1 = new CashMachine("1");
        CashMachine cashMachine2 = new CashMachine("2");
        CashMachine cashMachine3 = new CashMachine("3");
        CashMachine cashMachine4 = new CashMachine("4");
        CashMachine cashMachine5 = new CashMachine("5");

        cashMachine1.addTransaction(400);
        cashMachine1.addTransaction(-400);
        cashMachine1.addTransaction(200);

        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-300);
        cashMachine2.addTransaction(300);

        cashMachine3.addTransaction(300);
        cashMachine3.addTransaction(-300);
        cashMachine3.addTransaction(-500);

        cashMachine4.addTransaction(800);
        cashMachine4.addTransaction(800);
        cashMachine4.addTransaction(800);

        cashMachine5.addTransaction(300);
        cashMachine5.addTransaction(-100);
        cashMachine5.addTransaction(0);



        bank1 = new Bank();
        bank1.addCashMachine(cashMachine1);
        bank2 = new Bank();
        bank2.addCashMachine(cashMachine2);
        bank2.addCashMachine(cashMachine3);
        bank2.addCashMachine(cashMachine4);
        bank3 = new Bank();
        bank3.addCashMachine(cashMachine5);

    }


    @Test
    public void generalBalanceSum(){
        int bank1sum = bank1.generalBalance();
        int bank2sum = bank2.generalBalance();
        int bank3sum = bank3.generalBalance();
        assertEquals(200, bank1sum);
        assertEquals(2200, bank2sum);
        assertEquals(300, bank3sum);
        assertEquals(2700, bank1sum + bank2sum +
                bank3sum);
    }

    @Test
    public void negativePaymentCount(){
            int bank1negativePayments = bank1.negativePaymentsCounter();
            int bank2negativePayments = bank2.negativePaymentsCounter();
            int bank3negativePayments = bank3.negativePaymentsCounter();

            assertEquals(1, bank1negativePayments);
            assertEquals(3, bank2negativePayments);
            assertEquals(1, bank3negativePayments);
            assertEquals(5, bank1negativePayments +
                    bank2negativePayments + bank3negativePayments);

    }

    @Test
    public void positivePaymentCount(){
        int bank1positivePayments = bank1.positivePaymentsCounter();
        int bank2positivePayments = bank2.positivePaymentsCounter();
        int bank3positivePayments = bank3.positivePaymentsCounter();

        assertEquals(2, bank1positivePayments);
        assertEquals(6, bank2positivePayments);
        assertEquals(1, bank3positivePayments);
        assertEquals(9, bank1positivePayments +
                bank2positivePayments + bank3positivePayments);
    }

    @Test
    public void negativeAveragePayment(){
        double bank1negativePaymentsAverage = bank1.negativePaymentsAverage();
        double bank2negativePaymentsAverage = bank2.negativePaymentsAverage();
        double bank3negativePaymentsAverage = bank3.negativePaymentsAverage();

        assertEquals(-400, bank1negativePaymentsAverage, 0.1);
        assertEquals(-366.6, bank2negativePaymentsAverage, 0.1);
        assertEquals(0, bank3negativePaymentsAverage, 0.1);


    }

    @Test
    public void positiveAveragePayment(){
        double bank1positivePaymentsAverage = bank1.positivePaymentsAverage();
        double bank2positivePaymentsAverage = bank2.positivePaymentsAverage();
        double bank3positivePaymentsAverage = bank3.positivePaymentsAverage();

        assertEquals(300, bank1positivePaymentsAverage, 0.1);
        assertEquals(550, bank2positivePaymentsAverage, 0.1);
        assertEquals(300, bank3positivePaymentsAverage, 0.1);


    }






}