package org.example.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void makeSound() {
        Animal animal = new Animal();
        assertEquals("Непонятное животное издаёт звук",animal.makeSound());
    }
}