package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double a;
    private double b;
    private double h;

    public Shape(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public abstract double surfaceArea();

    public abstract double circuit();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }
}
