package DecoratorImplementation.ConcreteDecorators;

import DecoratorImplementation.Decorator.CharacterDecorator;
import DecoratorImplementation.Decorator.Character;
import CharacterHandbook.Handbook;

public class ArmorDecorator extends CharacterDecorator {

    public ArmorDecorator(Character character){
        super(character);
    }


    @Override
    public int getAttack(){
        return super.getAttack();
    }

    @Override
    public int getDefense(){
        return super.getDefense() + Handbook.getArmorDefense();
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + "\n+ Armor"
                + "\nAttack: " + getAttack()
                + "\nDefense: " + getDefense()+" (+" + Handbook.getArmorDefense() + ")" + "\n";
    }
}
