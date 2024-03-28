package org.example.Soundable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViolinTest {

    @Test
    void playSound() {
        Soundable violin = new Violin();
        assertEquals("Играет скрипка",violin.playSound());
    }
}