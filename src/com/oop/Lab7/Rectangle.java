package com.oop.Lab7;

public class Rectangle extends Figure{
    public Rectangle(double a, double b)
    {
        x = a;
        y = b;
    }
    @Override
    double getArea() {
        return x*y;
    }

    @Override
    double getPerimeter() {
        return (2 * x + 2 * y);
    }

    @Override
    String getName() {
        return "Rectangle";
    }
}
