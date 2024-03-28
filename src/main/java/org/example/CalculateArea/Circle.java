package org.example.CalculateArea;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String calculateArea() {
        double area = Math.PI*radius*radius;
        return "Площадь окружности с радиусом "+radius+" равна "+ Double.toString(area);
    }

    @Override
    public String calculatePerimetre() {
        double perimetre = 2*Math.PI*radius;
        return "Периметр окружности с радиусом "+radius+" равна "+ Double.toString(perimetre);
    }
}
