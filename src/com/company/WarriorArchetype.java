package com.company;


//---------------------ADD WARRIOR ---------------------

class WarriorArchetype extends DefaultArchetype {

    protected WarriorArchetype(String name,
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

    public int takeDamages(int dmgPerso2ou1){
        int damage2 = dmgPerso2ou1 - shield;
        System.out.println(damage-shield);
        if (damage2 <=0){
        }
        else {
            lifePoint = lifePoint - damage2;
        }

        return lifePoint;
    }

    public void WarriorArchetype(WarriorArchetype warriorArchetype) {
        System.out.println(warriorArchetype);
    }
}

