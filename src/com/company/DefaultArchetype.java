package com.company;

class DefaultArchetype {
    protected String name;
    protected int lifePoint;
    protected int damage;
    protected int initiative;

    protected void DefaultArchetype(String name, int lifePoint, int damage, int initiative){
        this.name = name;
        this.lifePoint = lifePoint;
        this.damage = damage;
        this.initiative = initiative;
    }
    public String toString(){
        return "name =  " + name + "\n" +
                "Lifepoint = " + lifePoint + "\n" +
                "Damage = " + damage + "\n" +
                "Initiative = " + initiative;
    }

    public int getDamages(){
        return damage;
    }

    public int takeDamages(int damage){
        lifePoint = lifePoint - damage;
        return lifePoint;
    }
}
