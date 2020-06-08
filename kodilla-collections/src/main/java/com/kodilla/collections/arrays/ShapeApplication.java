package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.shapes.Circle;
import com.kodilla.collections.interfaces.shapes.Shape;
import com.kodilla.collections.interfaces.shapes.Square;
import com.kodilla.collections.interfaces.shapes.Triangle;

import java.awt.*;
import java.util.Random;

public class ShapeApplication {

    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);
        double a = random.nextDouble() * 100 + 1;
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);


    }


}
