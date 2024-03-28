package org.example.Car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleTest {

    @Test
    void drive() {
        Vehicle bicycle = new Bicycle();
        assertEquals("Велосипед едет по гречке",bicycle.drive());
    }
}