package com.oop.Lab7;

public abstract class Figure {
    public double x;
    public double y;
    public Figure(double a)
    {
        x = a;
    }
    public Figure()
    {
        x = 0;
        y =0;
    }
    public Figure(double a, double b)
    {
        x = a;
        y = b;
    }
    abstract double  getArea();
    abstract double  getPerimeter();
    abstract String  getName();

}
