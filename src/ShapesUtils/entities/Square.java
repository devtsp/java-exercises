package ShapesUtils.entities;

import ShapesUtils.interfaces.ShapeCalculator;

public class Square implements ShapeCalculator {
    private double width;
    private double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return (this.width + this.height) * 2;
    }
}
