package DecoratorImplementation.Decorator;

public class CharacterDecorator implements Character{
    private Character character;

    public CharacterDecorator(Character character){
        this.character=character;
    }

    @Override
    public int getAttack(){
        return character.getAttack();
    }
    @Override
    public int getDefense(){
        return character.getDefense();
    }

    @Override
    public String getDescription(){
        return character.getDescription();
    }
}
