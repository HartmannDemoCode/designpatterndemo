package dk.ek.demo.decoratorsolution;

import dk.ek.demo.strategydemosolution.GameCharacter;

public class ArmoredDecorator extends CharacterDecorator {
    public ArmoredDecorator(IGameCharacter character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " [Armored]";
    }

    @Override
    public int getPower() {
        return super.getPower() + 15;
    }
}
