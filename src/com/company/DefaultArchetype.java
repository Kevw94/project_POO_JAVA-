package com.company;



public class DefaultArchetype  {


        protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

        protected int lifePoint;
        protected int damage;
        protected int initiative;
        
        


     DefaultArchetype() {
    }


    public DefaultArchetype(String name, int lifePoint, int damage, int initiative) {
    }


    public String toString() {
        return "Default Archetype" + "\n" +
                "name =  " + name + "\n" +
                "Lifepoint = " + lifePoint + "\n" +
                "Damage = " + damage + "\n" +
                "Initiative = " + initiative;
    }

    public int getDamages() {
        return damage;
    }

    public int takeDamages(int damage){
        lifePoint = lifePoint - damage;
        return lifePoint;
    }

    public void defaultArchetype(DefaultArchetype defaultArchetype) {
        System.out.println(defaultArchetype);
    }
}








// --------------------- TEST --------------------



//    List<DefaultArchetype> test () {
//
//        DefaultArchetype characterToList = new DefaultArchetype();
//        List<DefaultArchetype> listOfCharacters = new ArrayList();
//        listOfCharacters.add(characterToList);
//    }

//        DefaultArchetype characterToList = new DefaultArchetype();
//        test();

//static List<DefaultArchetype> listOfCharacters = new ArrayList();
