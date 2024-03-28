package org.example.Soundable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaxophoneTest {

    @Test
    void playSound() {
        Soundable saxophone = new Saxophone();
        assertEquals("Саксофон: тутутууу-путу-путуууу",saxophone.playSound());
    }
}