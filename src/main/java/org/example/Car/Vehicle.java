/*
4. Создать класс Vehicle с методом drive() и классы-наследники Car и Bicycle,
которые переопределяют данный метод с учетом способа передвижения каждого транспортного средства.
*/

package org.example.Car;

public class Vehicle {
    String surface = "Средство передвижения едет по земле";

    public String drive(){
        return surface;
    }
}
