package com.company;
import com.company.ShowListRegisteredCharacter;


import java.util.*;
//ORDRE DU MENU : 1 : QUIT, 2 : DEFAULT, 3 : WARRIOR, 4 : WIZARD, 5 : ROGUE
public class MenuArchetype extends Menu {

    //Scanner chooseWarrior = new Scanner(System.in);
    //int index; //= chooseWarrior.nextInt();
    //List<DefaultArchetype> listOfCharacters = new ArrayList();
    // J'active le scanner
    //Scanner menuTest = new Scanner(System.in);
    protected int numberChoosenByUser;


    protected void printMenuArchetype() {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Choose your fighter !");
            System.out.println("-----------------------------------------");
            String firstItemMenu = "1: Create Default";
            String secondItemMenu = "2: Create Warrior";
            String thirdItemMenu = "3: Create Wizard";
            String fourthItemMenu = "4: Create Rogue";
            String fifthItemMenu = "5: Return to menu";
            String sixthItemMenu = "6: Quit ";
            System.out.println(firstItemMenu);
            System.out.println(secondItemMenu);
            System.out.println(thirdItemMenu);
            System.out.println(fourthItemMenu);
            System.out.println(fifthItemMenu);
            System.out.println(sixthItemMenu);
            System.out.println();

            numberChoosenByUser = menu.nextInt();
            chooseTypeMenu(numberChoosenByUser);
        } catch (Exception e) {
            menu.nextLine();
            System.out.println("You written an invalid syntax");
            System.out.println("please enter a valid syntax for your all route referenced");
            System.out.println("Press Enter to continue");
            printMenuArchetype();
        }
    }

    protected void chooseTypeMenu(int anyNumber) {
        switch (anyNumber) {
            case 1:
                DefaultArchetype newCharacter = new DefaultArchetype();

                System.out.println("Entrez un nom");
                newCharacter.setName(menu.next());

                System.out.println("Entrez des lifepoint");
                newCharacter.setLifePoint(menu.nextInt());

                System.out.println("Entrez des damages");
                newCharacter.setDamage(menu.nextInt());

                System.out.println("Entrez une initiative");
                newCharacter.setInitiative(menu.nextInt());

                ShowListRegisteredCharacter.addDefaultArchetype(newCharacter);
                System.out.println(ShowListRegisteredCharacter.getListOfCharacters());

                break;

            // souhaitez vous créer un autre personnage ?
            //break;
            case 2:
                WarriorArchetype newWarriorCharacter = new WarriorArchetype();

                System.out.println("Entrez un nom");
                newWarriorCharacter.setName(menu.next());

                System.out.println("Entrez des lifepoint");
                newWarriorCharacter.setLifePoint(menu.nextInt());

                System.out.println("Entrez des damages");
                newWarriorCharacter.setDamage(menu.nextInt());

                System.out.println("Entrez une initiative");
                newWarriorCharacter.setInitiative(menu.nextInt());

                System.out.println("Entrez un shield");
                newWarriorCharacter.setShield(menu.nextInt());

                ShowListRegisteredCharacter.addDefaultArchetype(newWarriorCharacter);
                System.out.println(ShowListRegisteredCharacter.getListOfCharacters());
                break;

            case 3:
                WizardArchetype newWizardCharacter = new WizardArchetype();

                System.out.println("Entrez un nom");
                newWizardCharacter.setName(menu.next());

                System.out.println("Entrez des lifepoint");
                newWizardCharacter.setLifePoint(menu.nextInt());

                System.out.println("Entrez des damages");
                newWizardCharacter.setDamage(menu.nextInt());

                System.out.println("Entrez une initiative");
                newWizardCharacter.setInitiative(menu.nextInt());

                System.out.println("Entrez des magic damages");
                newWizardCharacter.setMagicDamage(menu.nextInt());

                ShowListRegisteredCharacter.addDefaultArchetype(newWizardCharacter);
                System.out.println(ShowListRegisteredCharacter.getListOfCharacters());
                break;

            case 4:
                RogueArchetype newRogueCharacter = new RogueArchetype();

                System.out.println("Entrez un nom");
                newRogueCharacter.setName(menu.next());

                System.out.println("Entrez des lifepoint");
                newRogueCharacter.setLifePoint(menu.nextInt());

                System.out.println("Entrez des damages");
                newRogueCharacter.setDamage(menu.nextInt());

                System.out.println("Entrez une initiative");
                newRogueCharacter.setInitiative(menu.nextInt());

                System.out.println("Entrez un dodge");
                newRogueCharacter.setDodge(menu.nextInt());

                System.out.println("Entrez un critical hit");
                newRogueCharacter.setCriticalHit(menu.nextInt());

                ShowListRegisteredCharacter.addDefaultArchetype(newRogueCharacter);
                System.out.println(ShowListRegisteredCharacter.getListOfCharacters());
//                listOfCharacters.add(new RogueArchetype());
//                System.out.println(listOfCharacters);
//                printMenu();
                break;
            case 5:
                //j'ai instancié la class ReturnMenuArchetype
                printMenu();
//                ReturnMenu nomReturnMenu = new ReturnMenu();
//                nomReturnMenu.ReturnAtMenu(createCharacter);
                break;
            case 6:
                Exit exit = new Exit();
                exit.Exit();
                break;

            default:
//                menu.nextLine();
//                System.out.println("You written an invalid number");
//                System.out.println("please enter a number referenced in the menu");
//                System.out.println("Press Enter to continue");
//                menu.nextLine();
                break;
               // printMenuArchetype();
        }

    }
}
//        catch (Exception e) {
//            menu.nextLine();
//            System.out.println("You written an invalid number");
//            System.out.println("please enter a number referenced in the menu");
//            System.out.println("Press Enter to continue");
//            menu.nextLine();
//            printMenuArchetype();
//        }








