package dk.ek.exercises.decoratorsolution;

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
