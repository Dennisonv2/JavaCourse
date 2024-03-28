package org.example.Animal;

public class Cat extends Animal {

    String sound = "Кот: мя.(кот если что сигма и мастер мьюнинг)";
    @Override
    public String makeSound() {
        return sound;
    }
}