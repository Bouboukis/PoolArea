package com.georgioskachrimanis.javacourse;

public class Cuboid extends Rectangle{

    private double height;

    // Constructors
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    // Getter
    public double getHeight() {
        return height;
    }

    //Methods
    public double getVolume() {
        return (getArea() * height);
    }

}

