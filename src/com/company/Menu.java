package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner chooseWarrior = new Scanner(System.in);
    int index; //= chooseWarrior.nextInt();
    List<DefaultArchetype> listOfCharacters = new ArrayList();

    Scanner menu = new Scanner(System.in);
    int numberChoosenByUser;
    //public DefaultArchetype perso1 =  listOfCharacters.get(index);
    //public DefaultArchetype perso2 = listOfCharacters.get(index);

     public Menu(){

    }


    void printMenu() {
        System.out.println("Application has started");
        System.out.println("  ");
        System.out.println("-----------------------------------------");
        String firstItemMenu = "1: Create Character";
        String secondItemMenu = "2: Show Character";
        String thirdItemMenu = "3: Fight";
        String fourthItemMenu = "4: Quit";
        String firthItemMenu = "5: createCharacter";
        System.out.println(firstItemMenu);
        System.out.println(secondItemMenu);
        System.out.println(thirdItemMenu);
        System.out.println(fourthItemMenu);
        System.out.println(firthItemMenu);
        System.out.println();

        numberChoosenByUser = menu.nextInt();
        chooseTypeMenu(numberChoosenByUser);
        }


    void chooseTypeMenu(int anyNumber) {
        switch (anyNumber) {
            case 1:
                listOfCharacters.add(new DefaultArchetype());
                //System.out.println(listOfCharacters);
                printMenu();

            case 2:
                System.out.println(listOfCharacters);
                printMenu();
            case 3:
                DefaultArchetype warrior1 = listOfCharacters.get(index = chooseWarrior.nextInt());
                DefaultArchetype warrior2 = listOfCharacters.get(index = chooseWarrior.nextInt());
                System.out.println(warrior1);
                System.out.println(warrior2);
                Fight fight = new Fight();
                fight.Fight(warrior1, warrior2);
                break;
            case 4:
                Exit exit = new Exit();
                exit.Exit();

                break;
//            case 5:
//                break;
//                DefaultArchetype newCharacter = new DefaultArchetype();
//                System.out.println(newCharacter);
        }

    }

//    private void Fight(DefaultArchetype perso1, DefaultArchetype perso2) {
//    }

}


//for(DefaultArchetype character : listOfCharacter {
//  sout(character)
//}


