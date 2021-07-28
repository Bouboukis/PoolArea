package com.georgioskachrimanis.javacourse;

public class Rectangle {

    private double width;
    private double length;

    // Constructors
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
    }

    // Getters and Setters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // Methods
    public double getArea() {
        return (width * length);
    }
}
