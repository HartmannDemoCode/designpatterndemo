package dk.ek.demo.decoratorsolution;

import dk.ek.demo.strategydemosolution.GameCharacter;

public class StrongDecorator extends CharacterDecorator {
    public StrongDecorator(IGameCharacter character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " [Strong]";
    }

    @Override
    public int getPower() {
        return super.getPower() + 20;
    }
}
