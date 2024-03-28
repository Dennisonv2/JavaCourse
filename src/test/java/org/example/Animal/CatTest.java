package org.example.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void testCatMakeSound() {
        Cat cat = new Cat();
        assertEquals("Кот: мя.(кот если что сигма и мастер мьюнинг)", cat.makeSound());
    }
}
