package org.example.Animal;

public class Dog extends Animal{
    String sound ="Собака: авуууфф гав гав авууууу!";
    @Override
    public String makeSound() {
        return sound;
    }
}
