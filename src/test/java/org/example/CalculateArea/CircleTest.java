package org.example.CalculateArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals("Площадь окружности с радиусом 5.0 равна 78.53981633974483", circle.calculateArea());
    }

    @Test
    public void testCirclePerimetre() {
        Circle circle = new Circle(5);
        assertEquals("Периметр окружности с радиусом 5.0 равна 31.41592653589793", circle.calculatePerimetre());
    }
}
