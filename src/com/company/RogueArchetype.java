package com.company;
// ------------------- Rogue ARCHETYPE ------------------------

import java.util.Random;

class RogueArchetype extends DefaultArchetype {
    int countCritical=0;

    protected RogueArchetype(String name,
                          int lifePoint,
                          int damage,
                          int initiative) {
        super(name, lifePoint, damage, initiative);

    }



    public void setDodge(int dodge) {
        this.dodgeScore = dodge;
    }

    public void setCriticalHit(int criticalHit) {
        this.criticalHit = criticalHit;
    }

    private int dodgeScore;
    private int criticalHit;


    public RogueArchetype() {

    }

    public String toString() {
        return "Rogue Archetype" + "\n" +
                "name =  " + name + "\n" +
                "Lifepoint = " + lifePoint + "\n" +
                "Damage = " + damage + "\n" +
                "Initiative = " + initiative + "\n" +
                "Dodge = " + dodgeScore + "\n" +
                "CriticalHit = " + criticalHit + "\n";
    }

    public int getDamages() {
        int randomNbr = (int) Math.floor(Math.random() * (100 - 0 + 1)) + 1;

        if (randomNbr<=criticalHit && countCritical==0){
            countCritical++;
            System.out.println("critical: "+ (this.damage*2));
            return this.damage*2;
        }else{
            countCritical=0;
            return this.damage;
        }
    }
    public int takeDamages(int damageperso1ou2) {
        int randomNbr = (int) Math.floor(Math.random() * (100 - 0 + 1)) + 1;

        if (randomNbr <= dodgeScore) {
            System.out.println("dodge");
            return lifePoint;
        } else {
            lifePoint = lifePoint - damageperso1ou2;
            return lifePoint;
        }

    }




    public void rogueArchetype(RogueArchetype rogueArchetype) {
        System.out.println(rogueArchetype);
    }
}