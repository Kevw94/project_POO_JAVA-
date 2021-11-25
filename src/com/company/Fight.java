package com.company;


import java.util.List;
import java.util.Scanner;

import static com.company.Main.fightTurn;

public class Fight extends Menu {

    public Fight() {

    }

     void Fight(DefaultArchetype perso1, DefaultArchetype perso2) {
        // -----------------------take initiative---------------------------
//       DefaultArchetype perso1, DefaultArchetype perso2;
        int initiative = perso1.initiative;
        int initiative2 = perso2.initiative;
        int fightTurn = 0;

        if (initiative > initiative2) {
            System.out.println("P1 will begin at this fight");
            joueurFunction1(perso1, perso2);
            //------------------------Print winner------------------------------

            if (perso1.lifePoint > 0) {
                System.out.println(perso1.name + " win the fight CONGRATS");
            } else {
                System.out.println(perso2.name + " win the fight CONGRATS");
            }

        } else {
            System.out.println("perso will begin the fight");
            joueurFunction2(perso1, perso2);
            if (perso1.lifePoint > 0) {
                System.out.println(perso1.name + " win the fight CONGRATS");
            } else {
                System.out.println(perso2.name + " win the fight CONGRATS");
            }
        }
    }



    //____________________________FUNCTION1_______________________________
    private static void joueurFunction1 (DefaultArchetype perso1, DefaultArchetype perso2){
        while (perso1.lifePoint > 0 && perso2.lifePoint > 0) {
            fightTurn++;
            System.out.println("Vous êtes au " + fightTurn + "ème tour");
            //___________infliger les dégat des joueur à chaque tour_____________
            perso2.takeDamages(perso1.getDamages());
            System.out.println("P1 dealt " + perso1.getDamages() + " damage to P2");
            if (perso2.lifePoint <= 0) {
                break;
            } else {
                System.out.println("HP of P2 = " + perso2.lifePoint);
            }


            perso1.takeDamages(perso2.getDamages());
            System.out.println("P2 dealt " + perso2.getDamages() + " damage to P1");
            if (perso1.lifePoint <= 0) {
                break;
            } else {
                System.out.println("HP of P1 = " + perso1.lifePoint);
            }
            //_____________________afficher le gagnant_________________________

        }
    }

    //___________________________________FUNCTION2________________________________
    private static void joueurFunction2 (DefaultArchetype perso1, DefaultArchetype perso2) {
        while (perso1.lifePoint > 0 && perso2.lifePoint > 0) {

            fightTurn++;
            System.out.println("Vous êtes au " + fightTurn + "ème tour");
            //___________infliger les dégat des joueur à chaque tour_____________
            perso1.takeDamages(perso2.getDamages());
            System.out.println("P2 dealt " + perso2.getDamages() + " damage to P1");
            if (perso1.lifePoint <= 0) {

                break;
            } else {
                System.out.println("HP of P1 = " + perso1.lifePoint);

            }
            perso2.takeDamages(perso1.getDamages());
            System.out.println("P1 dealt " + perso1.getDamages() + " damage to P2");
            if (perso2.lifePoint <= 0) {
                break;
            } else {
                System.out.println("HP of P2 = " + perso2.lifePoint);

            }
            //___________________afficher le gagnant____________________
        }
    }
}




