package org.example.Soundable;

public class Violin implements Soundable {
    String sound = "Играет скрипка";
    @Override
    public String playSound() {
        return sound;
    }
}