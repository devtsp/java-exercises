package Entities;

import Interfaces.ShapeCalculator;

public class Circle implements ShapeCalculator {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(pi * radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return pi * radius * 2;
    }
}
