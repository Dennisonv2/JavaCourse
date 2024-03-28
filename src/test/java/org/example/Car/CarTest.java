package org.example.Car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void drive() {
        Vehicle car = new Car();
        assertEquals("Машина едет по дороге",car.drive());
    }
}