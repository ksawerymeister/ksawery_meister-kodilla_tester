package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 9;
        int b = 4;

        int squareUpResult = calculator.squareUp(a);
        boolean correct = ResultChecker.assertEquals(81, squareUpResult);

        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczb "
                    + a + " i " + b);
        } else {
            System.out.println("Metoda działa niepoprawnie dla tych liczb");
        }

        int sumResult = calculator.sum(a, b);
        correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczb "
                    + a + " i " + b);
        } else {
            System.out.println("Metoda działa niepoprawnie dla tych liczb");
        }

        a= 5;
        b= 3;

        int subtractResult = calculator.subtract(a, b);
        correct = ResultChecker.assertEquals(2, subtractResult);

        if (correct) {
            System.out.println("Metoda działa pooprawnie dla liczb "
                    + a + " i " + b);
        } else {
            System.out.println("Metoda działa niepoprawnie dla tych liczb");
        }
    }



}
