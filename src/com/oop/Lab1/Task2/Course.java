package com.oop.Lab1.Task2;
import java.util.*;
public class Course {
    Scanner in = new Scanner(System.in);
    public String c_name;
    public int mark;

    public Course()
    {
        System.out.print("    Course name: ");
        c_name=in.nextLine();
        System.out.print("    Mark: ");
        mark=in.nextInt();
        System.out.println();
    }
}
