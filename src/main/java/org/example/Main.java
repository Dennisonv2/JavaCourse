package org.example;

import org.example.Animal.*;
import org.example.CalculateArea.*;
import org.example.Car.*;
import org.example.Soundable.*;

public class Main{
    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println(cat.makeSound());

        Shape circle = new Rectangle(7,15);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimetre());

        Soundable vio = new Violin();
        System.out.println(vio.playSound());

        Vehicle bicycle = new Bicycle();
        System.out.println(bicycle.drive());

    }
}