package org.example.Car;

public class Bicycle extends Vehicle {
    String surface = "Велосипед едет по гречке";
    @Override
    public String drive() {
        return surface;
    }
}