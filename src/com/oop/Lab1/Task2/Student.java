package com.oop.Lab1.Task2;

import java.util.*;

public class Student {
    static Scanner in = new Scanner(System.in);
    public String name;
    public Course[] obj = new Course[100];
    public int n_cour;
    public int age;
    public double media;

    public Student() {
        System.out.print(".Student name: ");
        name = in.next();
        System.out.print("  Age: ");
        age = in.nextInt();
        System.out.print("  Number of courses: ");
        n_cour = in.nextInt();
        media = 0;
        System.out.println("  Courses: ");
        for (int i = 0; i < n_cour; i++) {
            obj[i] = new Course();
            media += obj[i].mark;
        }
        media = media / n_cour;
        System.out.println("Media : " + media);
        System.out.println();

    }

    public void ShowStudent() {
        System.out.println(" Student name: " + name);
        System.out.println(" Age: " + age);
        System.out.println(" Media: " + media);
        System.out.println();
    }

}
