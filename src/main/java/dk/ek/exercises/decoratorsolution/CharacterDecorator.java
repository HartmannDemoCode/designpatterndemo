package dk.ek.exercises.decoratorsolution;

public class CharacterDecorator implements IGameCharacter {
    protected IGameCharacter decoratedCharacter;

    public CharacterDecorator(IGameCharacter decoratedCharacter) {
        this.decoratedCharacter = decoratedCharacter;
    }

    @Override
    public String getDescription() {
        return decoratedCharacter.getDescription();
    }

    @Override
    public int getPower() {
        return decoratedCharacter.getPower();
    }
}
