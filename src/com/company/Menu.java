package com.company;

import java.util.Scanner;

public class Menu {
    Scanner menu = new Scanner(System.in);
    int numberChoosenByUser;

     void Menu(){

    }


    void printMenu() {
        System.out.println("Application has started");
        System.out.println("  ");
        System.out.println("-----------------------------------------");
        String firstItemMenu = "1: Create Character";
        String secondItemMenu = "2: Show Character";
        String thirdItemMenu = "3: Fight";
        String fourthItemMenu = "4: Quit";
        System.out.println(firstItemMenu);
        System.out.println(secondItemMenu);
        System.out.println(thirdItemMenu);
        System.out.println(fourthItemMenu);
        System.out.println();

        numberChoosenByUser = menu.nextInt();
        chooseTypeMenu(numberChoosenByUser);
        }


    void chooseTypeMenu(int anyNumber) {
        switch (anyNumber) {
            case 1:
                MenuArchetype menuArchetype = new MenuArchetype();
                menuArchetype.MenuArchetype();
                break;
            case 2:
                ShowListRegisteredCharacter showListRegisteredCharacter = new ShowListRegisteredCharacter();
                showListRegisteredCharacter.ShowListRegisteredCharacter();
                break;
            case 3:
                Fight fight = new Fight();
                fight.Fight();
                break;
            case 4:
                Exit exit = new Exit();
                exit.Exit();
                break;
        }

    }

}



