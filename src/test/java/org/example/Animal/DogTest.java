package org.example.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void makeSound() {
        Animal dog = new Dog();
        assertEquals("Собака: авуууфф гав гав авууууу!",dog.makeSound());
    }
}