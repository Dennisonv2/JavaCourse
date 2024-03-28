package org.example.CalculateArea;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }

    @Override
    public String calculateArea() {
        double area = length* width;
        return "Площадь прямоугольник со сторонами "+width+" и "+length+" равна "+ Double.toString(area) ;
    }

    @Override
    public String calculatePerimetre() {
        double perimetre = 2*(length+width);
        return "Периметр прямоугольник со сторонами "+width+" и "+length+" равна "+ Double.toString(perimetre);
    }
}
