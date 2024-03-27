package org.example;

import org.example.Animal.*;
import org.example.CalculateArea.*;
import org.example.Car.*;
import org.example.Soundable.*;

public class Main{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        org.example.CalculateArea.Rectangle circle = new Rectangle(5,7);
        System.out.println("Площадь фигуры:"+circle.calculateArea());
        System.out.println("Периметр фигуры: "+circle.calculatePerimetre());

        Soundable vio = new Violin();
        vio.playSound();

        Vehicle bicycle = new Bicycle();
        bicycle.drive();

    }
}