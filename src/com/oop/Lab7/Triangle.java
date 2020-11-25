package com.oop.Lab7;

public class Triangle extends Figure{
    public double z;
    public Triangle(double a, double b, double c)
    {
        x = a;
        y = b;
        z = c;

    }
    @Override
    double getArea() {
        double p = (x + y + z) / 2;
        return p*(p-x)*(p-y)*(p-z);
    }

    @Override
    double getPerimeter() {
        return x + y + z;
    }

    @Override
    String getName() {
        return "Triangle";
    }
}
