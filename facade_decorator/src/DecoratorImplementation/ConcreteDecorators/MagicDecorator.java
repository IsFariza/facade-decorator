package DecoratorImplementation.ConcreteDecorators;

import CharacterHandbook.Handbook;
import DecoratorImplementation.Decorator.CharacterDecorator;
import DecoratorImplementation.Decorator.Character;

public class MagicDecorator extends CharacterDecorator {

    public MagicDecorator(Character character){
        super(character);
    }


    @Override
    public int getAttack(){
        return super.getAttack() + Handbook.getMagicAttack();
    }

    @Override
    public int getDefense(){
        return super.getDefense();
    }

    @Override
    public String getDescription(){
        return super.getDescription()
                + "\n+ Magic"
                + "\nAttack: " + getAttack() +" (+" + Handbook.getMagicAttack() + ")"
                + "\nDefense: " + getDefense() + "\n";
    }
}
