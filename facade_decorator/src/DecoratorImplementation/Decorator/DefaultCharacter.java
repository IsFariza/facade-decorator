package DecoratorImplementation.Decorator;

import CharacterHandbook.Handbook;

public class DefaultCharacter implements Character{

    @Override
    public int getAttack(){
        return Handbook.getBaseAttack();
    }

    @Override
    public int getDefense(){
        return Handbook.getBaseDefense();
    }

    @Override
    public String getDescription(){
        return "Base features:"+
                "\nAttack: " + getAttack() +
                "\nDefense: " + getDefense() + "\n";
    }

}
