package com.company;


//---------------------ADD WARRIOR ---------------------

class WarriorArchetype extends DefaultArchetype {

    public WarriorArchetype(String name,
                           int lifePoint,
                           int damage,
                           int initiative) {
        super(name, lifePoint, damage, initiative);

    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    int shield;

    WarriorArchetype(){
    }

    public String toString(){
        return "Warrior Archetype" + "\n" +
                "Name =  " + name + "\n" +
                "Lifepoint = " + lifePoint + "\n" +
                "Damage = " + damage + "\n" +
                "Initiative = " + initiative + "\n" +
                "Shield = " + shield + "\n";
    }

    public int getDamages(){
        return damage;
    }

    public int takeDamages(int damage){
        if (shield > damage){
            lifePoint = lifePoint + shield - damage;
            return lifePoint;
        }
        return lifePoint;
    }

    public void WarriorArchetype(WarriorArchetype warriorArchetype) {
        System.out.println(warriorArchetype);
    }
}

