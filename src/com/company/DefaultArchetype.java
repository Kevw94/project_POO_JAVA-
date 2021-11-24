package com.company;

class DefaultArchetype {
    private String name;
    private int lifePoint;
    private int damage;
    private int initiative;

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
