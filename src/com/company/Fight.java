package com.company;


public class Fight extends Menu {

    public Fight() {

    }

     void Fight(DefaultArchetype perso1, DefaultArchetype perso2) {
        int refreshPvPerso1 = perso1.getLifePoint();
        int refreshPvPerso2 = perso2.getLifePoint();
        // -----------------------take initiative---------------------------
//       DefaultArchetype perso1, DefaultArchetype perso2;
        int initiative = perso1.initiative;
        int initiative2 = perso2.initiative;
        int fightTurn = 0;

        if (initiative > initiative2) {
            System.out.println(perso1.name + " will begin at this fight");
            joueurFunction1(perso1, perso2);
            //------------------------Print winner------------------------------

            if (perso1.lifePoint > 0) {
                System.out.println(perso1.name + " wins the fight CONGRATS");
            } else {
                System.out.println(perso2.name + " wins the fight CONGRATS");
            }

        } else {
            System.out.println(perso2.name + " will begin the fight");
            joueurFunction2(perso1, perso2);
            if (perso1.lifePoint > 0) {
                System.out.println(perso1.name + " wins the fight CONGRATS");
            } else {
                System.out.println(perso2.name + " wins the fight CONGRATS");
            }
        }
         perso1.setLifePoint(refreshPvPerso1);
         perso2.setLifePoint(refreshPvPerso2);
    }



    //____________________________FUNCTION1_______________________________
    private static void joueurFunction1 (DefaultArchetype perso1, DefaultArchetype perso2){
        while (perso1.lifePoint > 0 && perso2.lifePoint > 0) {
            fightTurn++;
            System.out.println("Turn : " + fightTurn );
            //___________infliger les dégat des joueur à chaque tour_____________
            int dammagePerso1 = perso1.getDamages();
            perso2.takeDamages(dammagePerso1);
            System.out.println(perso1.name + " dealt " + dammagePerso1 + " damage  to " + perso2.name);
            if (perso2.lifePoint <= 0) {
                break;
            } else {
                System.out.println("HP of P2 = " + perso2.lifePoint);
            }

            int dammagePerso2 = perso2.getDamages();
            perso1.takeDamages(dammagePerso2);
            System.out.println(perso2.name + " dealt " + dammagePerso2 + " damage " + perso1.name );
            if (perso1.lifePoint <= 0) {
                break;
            } else {
                System.out.println("Health " +  perso1.name + " = " + perso1.lifePoint);
            }
            //_____________________afficher le gagnant_________________________

        }
    }

    //___________________________________FUNCTION2________________________________
    private static void joueurFunction2 (DefaultArchetype perso1, DefaultArchetype perso2) {
        while (perso1.lifePoint > 0 && perso2.lifePoint > 0) {

            fightTurn++;
            System.out.println("Turn : " + fightTurn);
            //___________infliger les dégat des joueur à chaque tour_____________
            int dammagePerso1 = perso1.getDamages();
            perso2.takeDamages(dammagePerso1);
            System.out.println(perso1.name + " dealt " + dammagePerso1+ " damage to " +  perso2.name);
            if (perso2.lifePoint <= 0) {
                break;
            } else {
                System.out.println("Health of " + perso2.name + " = " + perso2.lifePoint);
            }

            int dammagePerso2 = perso2.getDamages();
            perso1.takeDamages(dammagePerso2);
            System.out.println(perso2.name + " dealt " + dammagePerso2 + " damage to "  + perso1.name);
            if (perso1.lifePoint <= 0) {
                break;
            } else {
                System.out.println("Health of " + perso1.name + " = " + perso1.lifePoint);
            }
            //___________________afficher le gagnant____________________
        }
    }
}




