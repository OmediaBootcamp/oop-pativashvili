package dev.omedia.section11.Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Player implements ISaveable {
    private String name;
    private String weapon;

    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> myList = new ArrayList<>(4);
        myList.add(getName());
        myList.add(weapon);
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
            weapon = storedValues.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + "', " + "hitPoints=" +
                hitPoints + ", " + "strength=" + strength + ", " +
                "weapon='" + weapon + "'}";
    }
}
