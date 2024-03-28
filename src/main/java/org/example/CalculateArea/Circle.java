package org.example.CalculateArea;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimetre() {
        return 2*Math.PI*radius;
    }
}
