package com.company;

public class Main {

    public static void main(String[] args) {
//        Menu mainMenu = new Menu();
//        mainMenu.printMenu();

        // -----------------------Default creation archetype ----------------------
        DefaultArchetype perso1 = new DefaultArchetype();
        DefaultArchetype perso2 = new DefaultArchetype();
        perso2.DefaultArchetype("michel", 20, 2, 9);
        perso1.DefaultArchetype("Gérard",40,5,3);
        System.out.println(perso2);
        perso2.takeDamages(perso1.getDamages());
        perso1.takeDamages(perso2.getDamages());
        System.out.println(perso1);
        System.out.println(perso2);
        // --------------------------------------------------
    }
}
