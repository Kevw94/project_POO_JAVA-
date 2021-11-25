package com.company;
import com.company.ShowListRegisteredCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//implements Cloneable

public class Menu {
    static int fightTurn = 0;
    //   List<DefaultArchetype> listOfCharacters = new ArrayList();
    Scanner chooseWarrior = new Scanner(System.in);;
    Scanner menu = new Scanner(System.in);;
    int index; //= chooseWarrior.nextInt();
    int numberChoosenByUser;



    //    Scanner chooseWarrior = new Scanner(System.in);
//    Scanner menu = new Scanner(System.in);

//    List<DefaultArchetype> listOfCharacters = new ArrayList();



    public Menu() {


    }


    protected void printMenu() {
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


    protected void chooseTypeMenu(int anyNumber)  {
        switch (anyNumber) {
            case 1:
                new MenuArchetype().printMenuArchetype();

                //listOfCharacters.add(new DefaultArchetype());
                //System.out.println(listOfCharacters);
                printMenu();

            case 2:
                System.out.println(ShowListRegisteredCharacter.getListOfCharacters());
                printMenu();
            case 3:
                System.out.println(ShowListRegisteredCharacter.getListOfCharacters());
                System.out.println("choisissez votre combattant numéro 1");
                DefaultArchetype warrior1 = ShowListRegisteredCharacter.getListOfCharacters().get(index = chooseWarrior.nextInt() - 1);
                System.out.println("choisissez votre combattant numéro 2");
                DefaultArchetype warrior2 = ShowListRegisteredCharacter.getListOfCharacters().get(index = chooseWarrior.nextInt() - 1);

                Fight fight = new Fight();
                fight.Fight(warrior1, warrior2);
                printMenu();
                break;
            case 4:
                Exit exit = new Exit();
                exit.Exit();

                break;
            case 5:
                ShowListRegisteredCharacter.addDefaultArchetype(new DefaultArchetype());
            System.out.println(ShowListRegisteredCharacter.getListOfCharacters());
            printMenu();
        }

    }
};





