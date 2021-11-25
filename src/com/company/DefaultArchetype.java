package com.company;

import java.util.Scanner;

public class DefaultArchetype extends Menu {
    //Scanner createCharacter = new Scanner(System.in);
    //static DefaultArchetype character = new DefaultArchetype();
    String name;
    int lifePoint;
    int damage;
    int initiative;


    public DefaultArchetype() {
        System.out.println("Entrez un nom");
        this.name = menu.next();
        System.out.println("Entrez des damages");
        this.damage = menu.nextInt();
        System.out.println("Entrez des lifepoint");
        this.lifePoint = menu.nextInt();
        System.out.println("Entrez une initiative");
        this.initiative = menu.nextInt();
        System.out.println("Vous avez crée un nouveau personnage :)");
    }

//    void createCharacters(){
//        System.out.println("Entrez un nom");
//        this.name = menu.next();
//        System.out.println("Entrez des damages");
//        this.damage = menu.nextInt();
//        System.out.println("Entrez des lifepoint");
//        this.lifePoint = menu.nextInt();
//        System.out.println("Entrez une initiative");
//        this.initiative = menu.nextInt();
//        System.out.println("Vous avez crée un nouveau personnage :)");
//
//    }



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