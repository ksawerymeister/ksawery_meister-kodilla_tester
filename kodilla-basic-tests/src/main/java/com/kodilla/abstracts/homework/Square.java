package com.kodilla.abstracts.homework;

public class Square extends Shape {


    public Square(double a, double b, double h) {
        super(a, b, h);
    }



    @Override
    public double surfaceArea() {
        return getA() * getH();

    }

    @Override
    public double circuit() {
        return getA() * 4;
    }
}
