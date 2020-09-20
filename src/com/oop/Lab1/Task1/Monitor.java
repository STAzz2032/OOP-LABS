package com.oop.Lab1.Task1;

import java.util.*;

public class Monitor {
    static Scanner in = new Scanner(System.in);
    public String color;
    public String display_technology;
    public int diagonal;
    public String curved;

    public Monitor() {
        System.out.print("Color:");
        color = in.next();
        System.out.print("Display Technology:");
        display_technology = in.next();
        System.out.print("Diagonal(inches):");
        diagonal = in.nextInt();
        System.out.print("Is it curved?(Y/N)");
        curved = in.next();
        System.out.println();
    }

    public void WriteCharacteristics() {
        System.out.println("Color:" + color);
        System.out.println("Display Technology:" + display_technology);
        System.out.println("Diagonal(inches):" + diagonal);
        if (curved.equals("Y")) System.out.println("curved");
        else if (curved.equals("N")) System.out.println("flat");
        else System.out.println("Wrong input");
    }

    public static void main(String[] args) {
        System.out.println("Monitor 1");
        Monitor mon1 = new Monitor();
        System.out.println("Monitor 2");
        Monitor mon2 = new Monitor();
        System.out.println("Monitor 1");
        mon1.WriteCharacteristics();
        System.out.println();
        System.out.println("Monitor 2");
        mon2.WriteCharacteristics();
    }

}
