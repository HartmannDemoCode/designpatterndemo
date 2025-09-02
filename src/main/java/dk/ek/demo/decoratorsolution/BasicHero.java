package dk.ek.demo.decoratorsolution;

public class BasicHero implements IGameCharacter{
    private String name;

    public BasicHero(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public int getPower() {
        return 10; // base power
    }
}
