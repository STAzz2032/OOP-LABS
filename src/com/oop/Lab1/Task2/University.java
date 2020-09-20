package com.oop.Lab1.Task2;

import java.util.*;

public class University {
    static Scanner in = new Scanner(System.in);
    public String name;
    public int FoundationYear;
    public int nr_students;
    public double average;
    public Student[] students;

    University() {
        System.out.print("University Name : ");
        name = in.next();
        System.out.print("Foundation Year : ");
        FoundationYear = in.nextInt();
        System.out.print("Number of Students : ");
        nr_students = in.nextInt();
        students = new Student[nr_students];
        for (int i = 0; i < nr_students; i++) {
            System.out.print(i);
            students[i] = new Student();
        }
        System.out.println();
    }

    public void ShowUniversity() {
        System.out.println("University Name : " + name);
        System.out.println("Foundation Year : " + FoundationYear);
        System.out.println("Students : ");
        System.out.println();
        for (int i = 0; i < nr_students; i++) {
            students[i].ShowStudent();
            average += students[i].media;
        }
        average /= nr_students;
        System.out.println("Average media : " + average);
        System.out.println();
    }

    public static void main(String[] args) {
        University UTM = new University();
        University USM = new University();
        University ULIM = new University();
        UTM.ShowUniversity();
        USM.ShowUniversity();
        ULIM.ShowUniversity();
    }
}
