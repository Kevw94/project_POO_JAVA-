package com.company;
import java.util.ArrayList;
import java.util.List;

public class ShowListRegisteredCharacter  {
    public static List<DefaultArchetype> getListOfCharacters() {
        return listOfCharacters;
    }

    static List<DefaultArchetype> listOfCharacters = new ArrayList();

    public static DefaultArchetype addDefaultArchetype(DefaultArchetype newCharacter){
        listOfCharacters.add(newCharacter);
        return newCharacter;
    }

    public void ShowListRegisteredCharacter() {

        System.out.println(listOfCharacters);


        //System.out.println(listOfCharacters);

        System.out.println("ShowListRegisteredCharacter :)");
    }
}