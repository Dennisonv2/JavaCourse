package org.example.Car;

public class Car extends Vehicle {
    String surface = "Машина едет по дороге";
    @Override
    public String drive() {
        return surface;
    }
}