package org.example.Soundable;

public class Saxophone implements Soundable {
    @Override
    public void playSound() {
        System.out.println("Saxophone sound: TUTUDUTUDUTU");
    }
}