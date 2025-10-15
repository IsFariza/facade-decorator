package Client;

import FacadeImplementation.CharacterCreator;

public class Main {
    public static void main(String[] args){
        CharacterCreator creator = new CharacterCreator();

        System.out.println("---Character with Armor---");
        System.out.println(creator.createCharacterWithArmor().getDescription());
        System.out.println("---Character with Armor and Weapon---");
        System.out.println(creator.createCharacterWithArmorAndWeapon().getDescription());
        System.out.println("---Character with Armor, Weapon, Magic---");
        System.out.println(creator.createFullSetCharacter().getDescription());
    }
}




