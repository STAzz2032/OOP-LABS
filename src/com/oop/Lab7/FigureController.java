package com.oop.Lab7;
import java.text.DecimalFormat;


public class FigureController {

    public FigureController() {}
    
    public Figure[] add_figure(int n, Figure[] myarray, Figure ele)
    {

        Figure[] newArray = new Figure[n + 1];
        //copy original array into new array
        for (int i = 0; i <n; i++)
        newArray[i] = myarray[i];

        //add element to the new array
        newArray[n] = ele;

        return newArray;
    }
    
    private final static DecimalFormat df2 = new DecimalFormat("0.00");
    
    public void biggestArea(Figure[] figures)
    {

        double area = 0;
        String name = "";

        for (Figure figure : figures)
            if (figure.getArea() > area) {
                area = figure.getArea();
                name = figure.getName();
            }
        System.out.println(name + " has the biggest area (" + df2.format(area) + ")");
    }
    public void biggestPerimeter(Figure[] figures)
    {

        double perimeter = 0;
        String name = "";

        for (Figure figure : figures)
            if (figure.getPerimeter() > perimeter) {
                perimeter = figure.getPerimeter();
                name = figure.getName();
            }
        System.out.println(name + " has the biggest perimeter (" + df2.format(perimeter) + ")");
    }
}
