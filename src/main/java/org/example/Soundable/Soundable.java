/*
5. Создать класс Soundable с методом playSound(), который воспроизводит звук, и классы-наследники Saxophone и Violin,
которые переопределяют метож для каждого музыкального инструмента.
*/

package org.example.Soundable;

public class Soundable {
    String sound = "Играет непонятный музыкальный инструмент";
    public String playSound(){
        return sound;
    }
}
