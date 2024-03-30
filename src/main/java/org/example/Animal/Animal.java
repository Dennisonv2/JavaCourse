/*
1. Создать класс Animal с методом makeSound() и классы-наследники Dog и Cat,
которые переопределяют этот метод для издания соответствующего звука.
*/

package org.example.Animal;

public class Animal {
    public String makeSound(){
        String sound = "Непонятное животное издаёт звук";
        return sound;
    }
}
