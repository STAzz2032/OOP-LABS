package com.oop.Lab8;

import com.oop.Lab8.GeometricFigures.Cube;
import com.oop.Lab8.GeometricFigures.Parallelipiped;
import com.oop.Lab8.GeometricFigures.Sphere;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GeometricBody cube = new Cube(19, 3);
        GeometricBody sphere = new Sphere(33, 17);
        GeometricBody parallelepiped = new Parallelipiped(5, 9);

        ArrayList<GeometricBody> bodies = new ArrayList<>();
        bodies.add(cube);
        bodies.add(sphere);
        bodies.add(parallelepiped);

        System.out.println("Maximum surface - " + GeometricBodyController.maxSurface(bodies).getSurface());
        System.out.println("Maximum volume - " + GeometricBodyController.maxVolume(bodies).getVolume());

    }
}