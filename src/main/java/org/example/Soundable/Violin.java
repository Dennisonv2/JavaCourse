package org.example.Soundable;

public class Violin extends Soundable {
    String sound = "Играет скрипка";
    @Override
    public String playSound() {
        return sound;
    }
}