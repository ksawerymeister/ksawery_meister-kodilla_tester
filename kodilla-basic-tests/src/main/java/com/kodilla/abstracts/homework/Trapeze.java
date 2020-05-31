package com.kodilla.abstracts.homework;

public class Trapeze extends Shape {

    private double b;

//    public Trapeze(double b){
//        this.b = b;
//    }

    public Trapeze(double a, double b, double h) {
        super(a, b, h);
    }

    @Override
    public double surfaceArea() {
        return 0.5 * (getA() + getB()) * getH();
    }

    @Override
    public double circuit() {
        return getA() + getB() + getH() * getH();
    }
}
