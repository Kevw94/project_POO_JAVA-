package com.company;
import com.company.ShowListRegisteredCharacter;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.company.ShowListRegisteredCharacter.listOfCharacters;
//implements Cloneable

public class Menu {
    static int fightTurn = 0;
    //   List<DefaultArchetype> listOfCharacters = new ArrayList();
    Scanner chooseWarrior = new Scanner(System.in);

    Scanner menu = new Scanner(System.in);
    
    int index; //= chooseWarrior.nextInt();
    int numberChoosenByUser;


    //    Scanner chooseWarrior = new Scanner(System.in);
//    Scanner menu = new Scanner(System.in);

//    List<DefaultArchetype> listOfCharacters = new ArrayList();


    public Menu() {


    }


    protected void printMenu() {

        try {


            System.out.println("Application has started");
            System.out.println("  ");
            System.out.println("-----------------------------------------");
            String firstItemMenu = "1: Create Character";
            String secondItemMenu = "2: Show Character";
            String thirdItemMenu = "3: Fight";
            String fourthItemMenu = "4: Quit";
            String firthItemMenu = "5: Remove character";
            System.out.println(firstItemMenu);
            System.out.println(secondItemMenu);
            System.out.println(thirdItemMenu);
            System.out.println(fourthItemMenu);
            System.out.println(firthItemMenu);
            System.out.println();

            numberChoosenByUser = menu.nextInt();
            chooseTypeMenu(numberChoosenByUser);
        }

        catch (Exception e)  {
            menu.nextLine();
            System.out.println("You written an invalid number");
            System.out.println("please enter a number referenced in the menu");
            System.out.println("Press Enter to continue");
            printMenu();
        }
    }



    protected void chooseTypeMenu(int anyNumber) {
            switch (anyNumber) {

                case 1:
                    new MenuArchetype().printMenuArchetype();

                    //listOfCharacters.add(new DefaultArchetype());
                    //System.out.println(listOfCharacters);
                    printMenu();
                    break;

                case 2:
                    new ShowListRegisteredCharacter().ShowListRegisteredCharacter();
                    System.out.println(ShowListRegisteredCharacter.getListOfCharacters().get(index));
                    printMenu();
                    break;
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
                    System.out.println("------------------------------");
                    System.out.println(" Choose your Character to delete ! ");
                    System.out.println("------------------------------");
                    System.out.println(listOfCharacters);
                    DefaultArchetype removewarrior = ShowListRegisteredCharacter.getListOfCharacters().get(index = chooseWarrior.nextInt() - 1);

                    ShowListRegisteredCharacter.getListOfCharacters().remove(removewarrior);

                    //System.out.println(removewarrior);
                    System.out.println(ShowListRegisteredCharacter.getListOfCharacters());
                    printMenu();
                    break;

                default:
                    menu.nextLine();
                    System.out.println("You written an invalid number");
                    System.out.println("please enter a number referenced in the menu");
                    System.out.println("Press Enter to continue");
                    //menu.nextLine();
                    printMenu();
                    break;
            }
    }
}





