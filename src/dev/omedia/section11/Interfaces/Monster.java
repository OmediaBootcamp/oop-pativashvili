package dev.omedia.section11.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> myList = new ArrayList<>(4);
        myList.add(getName());
        myList.add(Integer.toString(getHitPoints()));
        myList.add(Integer.toString(getStrength()));
        return myList;
    }

    @Override
    public void read(List<String> storedValues) {
        if (storedValues != null && !storedValues.isEmpty()) {
            name = storedValues.get(0);
            hitPoints = Integer.parseInt(storedValues.get(1));
            strength = Integer.parseInt(storedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + "', " + "hitPoints=" +
                hitPoints + ", " + "strength=" + strength + ", ";
    }
}
