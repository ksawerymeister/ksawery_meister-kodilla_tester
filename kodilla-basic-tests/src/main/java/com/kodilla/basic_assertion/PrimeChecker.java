package com.kodilla.basic_assertion;

public class PrimeChecker {

    public boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        int quantityOfDivs = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                quantityOfDivs++;
            }
            if (quantityOfDivs > 2) {
                return false;
            }
        }
        return true;
    }
}



