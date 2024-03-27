package org.example.Car;

public class Car implements Vehicle {
    String surface = "Машина едет по дороге";
    @Override
    public String drive() {
        return surface;
    }
}