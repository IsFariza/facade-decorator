package DecoratorImplementation.ConcreteDecorators;

import CharacterHandbook.Handbook;
import DecoratorImplementation.Decorator.CharacterDecorator;
import DecoratorImplementation.Decorator.Character;
public class WeaponDecorator extends CharacterDecorator{

    public WeaponDecorator(Character character){
        super(character);
    }


    @Override
    public int getAttack(){
        return super.getAttack() + Handbook.getWeaponAttack();
    }

    @Override
    public int getDefense(){
        return super.getDefense();
    }

    @Override
    public String getDescription(){

        return super.getDescription()
                + "\n+ Weapon"
                + "\nAttack: " + getAttack() +" (+" + Handbook.getWeaponAttack() + ")"
                + "\nDefense: " + getDefense() + "\n";
    }
}
