package com.company;
// ------------------- Rogue ARCHETYPE ------------------------

import java.util.Random;

class RogueArchetype extends DefaultArchetype {

    public RogueArchetype(String name,
                          int lifePoint,
                          int damage,
                          int initiative) {
        super(name, lifePoint, damage, initiative);

    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public void setCriticalHit(int criticalHit) {
        this.criticalHit = criticalHit;
    }

    private int dodge;
    private int criticalHit;


    public RogueArchetype() {

    }

    public String toString() {
        return "name =  " + name + "\n" +
                "Lifepoint = " + lifePoint + "\n" +
                "Damage = " + damage + "\n" +
                "Initiative = " + initiative + "\n" +
                "Dodge = " + dodge + "\n" +
                "CriticalHit = " + criticalHit + "\n";
    }

    public void PercentDodge() {
        Random random = new Random();
        int value = random.nextInt(100 + 1 + 1) + 1;
        boolean madeDodge;
        if (value <= dodge) {
            madeDodge = true;
        } else {
            madeDodge = false;
        }
    }

    public void PercentCriticalHit() {
        Random random = new Random();
        int value = random.nextInt(100 + 1 + 1) + 1;
        boolean madeCriticalHit;
        if (value <= criticalHit) {
            madeCriticalHit = true;
        } else {
            madeCriticalHit = false;
        }
    }

    public void rogueArchetype(RogueArchetype rogueArchetype) {
        System.out.println(rogueArchetype);
    }
}