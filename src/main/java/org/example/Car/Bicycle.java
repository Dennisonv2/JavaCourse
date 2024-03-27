package org.example.Car;

public class Bicycle implements Vehicle {
    String surface = "Велосипед едет по гречке";
    @Override
    public String drive() {
        return surface;
    }
}