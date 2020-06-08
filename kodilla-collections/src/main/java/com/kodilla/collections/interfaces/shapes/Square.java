package com.kodilla.collections.interfaces.shapes;

public class Square implements Shape {
    private double width;


    public Square(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }


}
