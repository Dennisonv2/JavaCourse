/*
2. Создать класс Shape с методом calculateArea() для вычисления площади фигуры и 2 класса-наследника Circle и Rectangle
с переопределенным методом calculateArea(), который расчитывает площадь конкретной фигуры.

3. Дополонить предыдущий класс методом calculatePerimetre(), для вычисления периметра фигур.
*/
package org.example.CalculateArea;

public abstract class Shape {
    public abstract String calculateArea();
    public abstract String calculatePerimetre();
}
