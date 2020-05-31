package com.kodilla.abstracts.homework;

public class ShapeRunner {
    public static void main(String[] args) {

        Square square = new Square(6, 6, 6);
        Shape triangle = new Triangle(3.5, 3.5, 4);
        Shape trapeze = new Trapeze(8,4,3.5);

        System.out.println("surface of square equals " + square.surfaceArea());
        System.out.println("circuit of square equals  " + square.circuit());

        System.out.println("surface of triangle equals " + triangle.surfaceArea());
        System.out.println("surface of triangle equals " + triangle.circuit());

        System.out.println("surface of trapeze equals " + trapeze.surfaceArea());
        System.out.println("surface of trapeze equals " + trapeze.circuit());

    }
}
