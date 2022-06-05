package main.java.com.eTmy.caterpillarIsland.objects.animals.herbivores;

import main.java.com.eTmy.caterpillarIsland.objects.abstracts.HerbivoreAnimal;

public class Rabbit extends HerbivoreAnimal {
    public Rabbit(int positionX, int positionY) {
        super(positionX, positionY);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC07";
    }
}