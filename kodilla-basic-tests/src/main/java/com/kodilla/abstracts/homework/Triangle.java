package com.kodilla.abstracts.homework;

public class Triangle extends Shape {


    public Triangle(double a, double b, double h) {
        super(a, b, h);
    }

    @Override
    public double surfaceArea() {
        return getA() * getH();
    }

    @Override
    public double circuit() {
        return getA() * 3;
    }
}
