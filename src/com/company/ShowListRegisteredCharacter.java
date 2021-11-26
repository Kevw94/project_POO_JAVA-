package com.company;
import java.util.ArrayList;
import java.util.List;

public class ShowListRegisteredCharacter  {


    static List<DefaultArchetype> listOfCharacters = new ArrayList();


    public static List<DefaultArchetype> getListOfCharacters() {
        return listOfCharacters;
    }
    public static List<DefaultArchetype> setListOfCharacters(List<DefaultArchetype> listOfCharacters) {
        ShowListRegisteredCharacter.listOfCharacters = listOfCharacters;
        return listOfCharacters;
    }

    //static List<DefaultArchetype> listOfCharacters = new ArrayList();

    public static DefaultArchetype addDefaultArchetype(DefaultArchetype newCharacter){
        listOfCharacters.add(newCharacter);
        return newCharacter;
    }

    public void ShowListRegisteredCharacter() {
        //System.out.println(setListOfCharacters(listOfCharacters.()));
        //System.out.println(listOfCharacters);

        //System.out.println(listOfCharacters);

        //System.out.println("ShowListRegisteredCharacter :)");
    }
//    public String toString(){
//        //setListOfCharacters(listOfCharacters).get(indexList());
//
//        //String.valueOf(setListOfCharacters(int index));
//    }

}