package org.example.Car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void drive() {
        Vehicle vehicle = new Vehicle();
        assertEquals("Средство передвижения едет по земле",vehicle.drive());
    }
}