package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Menu mainMenu = new Menu();
//        mainMenu.printMenu();
        Scanner test = new Scanner(System.in);

        System.out.println("Entrez un nom");
        String name = test.next();
        System.out.println("Entrez des damages");
        int damage = test.nextInt();
        System.out.println("Entrez des lifepoint");
        int lifePoint = test.nextInt();
        System.out.println("Entrez une initiative");
        int initiative = test.nextInt();

        DefaultArchetype persoTest = new DefaultArchetype(name,
                damage,
                lifePoint,
                initiative);



        System.out.println(persoTest);
        //----------------- try create pers from Scanner -----------

//        DefaultArchetype.persoTest.name = test.next(persoTest.name);
//        DefaultArchetype.damage = test.nextInt(persoTest.damage);
//        DefaultArchetype.lifePoint = test.nextInt(persoTest.lifePoint);
//        DefaultArchetype.initiative = test.nextInt(persoTest.initiative);
//





        //DefaultArchetype persoTest = new DefaultArchetype(name, damage, lifePoint, initiative);


        //System.out.println(persoTest);


        // -----------------------Default creation archetype ----------------------
//        DefaultArchetype perso1 = new DefaultArchetype();
//        DefaultArchetype perso2 = new DefaultArchetype();
//        perso2.DefaultArchetype("michel", 3000, 33, 9);
//        perso1.DefaultArchetype("Gérard", 40000, 231, 34);

//        int initiative = perso1.initiative;
//        int initiative2 = perso2.initiative;
    }

//        if (initiative > initiative2){
//            System.out.println("Au tour du perso1");
//            joueurFunction1(perso2, perso1);
//            // démarrage du combat joueur n°2
//        }
//        else {
//            System.out.println("Au tour du perso 2");
//            joueurFunction2(perso2, perso1);
//            // démarrage du combat joueur n°1
//        }
//
//        }
//
//    private static void joueurFunction1(DefaultArchetype perso2, DefaultArchetype perso1) {
//
//        System.out.println("bonjour");
//        while (perso1.lifePoint > 0 && perso2.lifePoint > 0 ){
//            perso2.takeDamages(perso1.getDamages());
//            perso1.takeDamages(perso2.getDamages());
//            System.out.println(perso1);
//            System.out.println(perso2);
//            if (perso1.lifePoint == 0) {
//                System.out.println("perso 2 a gagné ");
//                break;
//            }
//            else {
//                System.out.println("peso 1 a gagné ");
//                break;
//            }
//
//        }
//
//
//
//    }
//
//    private static void joueurFunction2(DefaultArchetype perso2, DefaultArchetype perso1) {
//        while (perso2.lifePoint > 0 && perso1.lifePoint > 0 ){
//            perso2.takeDamages(perso1.getDamages());
//            perso1.takeDamages(perso2.getDamages());
//            System.out.println(perso1);
//            System.out.println(perso2);
//            if (perso1.lifePoint == 0) {
//                System.out.println("perso 2 a gagné ");
//                break;
//            }
//            else {
//                System.out.println("peso 1 a gagné ");
//                break;
//            }
//
//        }
//    }


//    void joueurFunction1 () {
//
//
//        }


    // boucle 2


    // --------------------------------------------------
}
