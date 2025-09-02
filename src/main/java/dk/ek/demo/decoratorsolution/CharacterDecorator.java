package dk.ek.demo.decoratorsolution;

import dk.ek.demo.strategydemosolution.GameCharacter;

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
