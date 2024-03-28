package org.example.Soundable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoundableTest {

    @Test
    void playSound() {
        Soundable soundable = new Soundable();
        assertEquals("Играет непонятный музыкальный инструмент",soundable.playSound());
    }
}