package com.company;

import java.util.Scanner;

public class DefaultArchetype {
    Scanner defaultScan = new Scanner(System.in);
    String name;
    int lifePoint;
    int damage;
    int initiative;

    public DefaultArchetype(String name, int lifePoint, int damage, int initiative) {
        this.name = name;
        this.lifePoint = lifePoint;
        this.damage = damage;
        this.initiative = initiative;
    }

    public String toString() {
        return "name =  " + name + "\n" +
                "Lifepoint = " + lifePoint + "\n" +
                "Damage = " + damage + "\n" +
                "Initiative = " + initiative;
    }

    public int getDamages() {
        return damage;
    }

    public int takeDamages(int damage) {
        lifePoint = lifePoint - damage;
        return lifePoint;
    }
}
