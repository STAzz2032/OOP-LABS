package com.oop.Lab7;

public class Square extends Figure {
    public Square(double a)
    {
        x = a;
        y = a;
    }
    @Override
    double getArea() {
        return x*x;
    }

    @Override
    double getPerimeter() {
        return 4 * x;
    }

    @Override
    String getName() {
        return "Square";
    }
}
