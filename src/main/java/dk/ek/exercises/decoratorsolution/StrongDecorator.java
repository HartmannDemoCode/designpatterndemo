package dk.ek.exercises.decoratorsolution;

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
