package com.company;

import static com.company.Main.fightTurn;

public class Fight {
    DefaultArchetype perso1 = new DefaultArchetype();
    DefaultArchetype perso2 = new DefaultArchetype();



    void Fight() {
        perso1.DefaultArchetype("michel", 58, 8, 20);
        perso2.DefaultArchetype("Gérard", 48, 8, 30);



        // -----------------------take initiative---------------------------
//        DefaultArchetype perso1, DefaultArchetype perso2;
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
            System.out.println("P2 will begin the fight");
            joueurFunction2(perso1, perso2);
            if (perso1.lifePoint > 0) {
                System.out.println(perso1.name + " win the fight CONGRATS");
            } else {
                System.out.println(perso2.name + " win the fight CONGRATS");
            }
        }
    }
}
