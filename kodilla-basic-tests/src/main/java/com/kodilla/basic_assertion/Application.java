package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(9, 4);

        boolean correct = ResultChecker.assertEquals(81, calculator.squareUp());
        Application.result(correct, calculator.getA(), calculator.getB());

        calculator.setA(14);
        calculator.setB(10);

        correct = ResultChecker.assertEquals(13, calculator.sum());
        Application.result(correct, calculator.getA(), calculator.getB());

        calculator.setA(4);
        calculator.setB(2);

        correct = ResultChecker.assertEquals(2, calculator.subtract());
        Application.result(correct, calculator.getA(), calculator.getB());
    }

    public static void result(boolean correct, int a, int b) {
        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczb "
                    + a + " i " + b);
        } else {
            System.out.println("Metoda działa niepoprawnie dla tych liczb");
        }
    }
}
