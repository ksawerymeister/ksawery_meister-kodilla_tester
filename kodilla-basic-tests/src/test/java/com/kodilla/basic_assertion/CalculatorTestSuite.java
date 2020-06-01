package com.kodilla.basic_assertion;



import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    private Calculator calculator;
    @BeforeEach
    public void before(){
         calculator = new Calculator(5, 8);
    }

    @Test
    public void sumTest() {
        // When & Then
        assertEquals(13, calculator.sum());
    }

    @Test
    public void squareTest(){
        assertEquals(25, calculator.squareUp());
    }

    @Test
    public void subtractTest(){
        assertEquals(-3, calculator.subtract());
    }

    @Test
    public void squareNegativeTest(){
        calculator.setA(-2);
        assertEquals(4, calculator.squareUp());
    }

    @Test
    public void squareZeroTest(){
        calculator.setA(0);
        assertEquals(0, calculator.squareUp());
    }

    @Test
    public void squarePositiveTest(){
        calculator.setA(10);
        assertEquals(100, calculator.squareUp());
    }

}
