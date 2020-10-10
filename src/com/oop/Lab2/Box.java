package com.oop.Lab2;

public class Box {
    public double height;
    public double width;
    public double depth;
    public Box()
    {
        width=1;
        height=1;
        depth=1;
    }
    public Box(double value)
    {
        width = value;
        height = value;
        depth = value;
    }
    public Box(double wid,double hei,double dep)
    {
        width = wid;
        height = hei;
        depth = dep;
    }
    public double Area()
    {
        return 2 * width * height + 2 * width * depth + 2 * depth * height;
    }

    public double Volume()
    {
        return width*height*depth;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(3,4,5);
        System.out.println("Box 3 Area = " + b3.Area());
        System.out.println("Box 3 Volume = " + b3.Volume());
    }
}
