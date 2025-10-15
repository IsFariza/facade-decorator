package FacadeImplementation;

import DecoratorImplementation.ConcreteDecorators.ArmorDecorator;
import DecoratorImplementation.ConcreteDecorators.MagicDecorator;
import DecoratorImplementation.ConcreteDecorators.WeaponDecorator;
import DecoratorImplementation.Decorator.DefaultCharacter;
import DecoratorImplementation.Decorator.Character;

public class CharacterCreator {

    public Character createCharacterWithArmor() {
        return new ArmorDecorator(new DefaultCharacter());
    }

    public Character createCharacterWithWeapon() {
        Character character = new DefaultCharacter();
        character = new WeaponDecorator(character);
        return character;
    }

    public Character createCharacterWithMagic() {
        Character character = new DefaultCharacter();
        character = new MagicDecorator(character);
        return character;

    }

    public Character createCharacterWithArmorAndWeapon() {
        Character character = new DefaultCharacter();
        character = new WeaponDecorator(character);
        character = new ArmorDecorator(character);
        return character;

    }

    public Character createCharacterWithMagicAndWeapon() {
        Character character = new DefaultCharacter();
        character = new WeaponDecorator(character);
        character = new MagicDecorator(character);
        return character;
    }

    public Character createFullSetCharacter() {
        Character character = new DefaultCharacter();
        character = new WeaponDecorator(character);
        character = new MagicDecorator(character);
        character = new ArmorDecorator(character);
        return character;
    }
}