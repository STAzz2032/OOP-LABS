package com.oop.Lab7;

public class Main {
    public static void main(String[] args) {
        Figure fig1 = new Rectangle(1, 1.2);
        Figure fig2 = new Square(1.2);
        Figure fig3 = new Triangle(5.5, 2.6, 4.5);
        Figure[] figArr = {fig1, fig2, fig3};
        FigureController f1 = new FigureController();
        System.out.println("Before adding circle:");
        f1.biggestArea(figArr);
        f1.biggestPerimeter(figArr);
        Figure fig4 = new Figure(40.9) {
            @Override
            double getArea() {
                return 3.14 * x * x;
            }

            @Override
            double getPerimeter() {
                return 3.14 * 2 * x;
            }

            @Override
            String getName() {
                return "Circle";
            }
        };
        figArr = f1.add_figure(figArr.length, figArr,fig4);
        System.out.println("After adding circle:");
        f1.biggestArea(figArr);
        f1.biggestPerimeter(figArr);
    }

}
