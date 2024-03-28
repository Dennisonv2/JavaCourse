package org.example.CalculateArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testRectangleArea() {
        Shape rectangle = new Rectangle(10, 5);
        assertEquals("Площадь прямоугольника со сторонами 10.0 и 5.0 равна 50.0", rectangle.calculateArea());
    }

    @Test
    public void testRectanglePerimetre() {
        Shape rectangle = new Rectangle(5, 10);
        assertEquals("Периметр прямоугольника со сторонами 10.0 и 5.0 равна 30.0", rectangle.calculatePerimetre());
    }
}
