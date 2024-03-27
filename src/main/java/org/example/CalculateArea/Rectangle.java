package org.example.CalculateArea;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimetre() {
        return 2*(length+width);
    }
}
