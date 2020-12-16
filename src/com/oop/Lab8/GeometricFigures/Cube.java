package com.oop.Lab8.GeometricFigures;

import com.oop.Lab8.GeometricBody;

public class Cube implements GeometricBody {
    private float surface;
    private float volume;

    public Cube(float surface, float volume) {
        this.surface = surface;
        this.volume = volume;
    }

    @Override
    public float getSurface() {
        return surface;
    }

    @Override
    public float getVolume() {
        return volume;
    }
}
