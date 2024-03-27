package org.example.Soundable;

public class Saxophone implements Soundable {
    String sound = "Саксофон: тутутууу-путу-путуууу";
    @Override
    public String playSound() {
        return sound;
    }
}