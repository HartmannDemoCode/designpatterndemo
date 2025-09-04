package dk.ek.exercises.factorydemo;

public class GameCharacter {
    private String name;
    private IAttackStrategy attackStrategy;

    public GameCharacter(String name, IAttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    public void setAttackStrategy(IAttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        if (attackStrategy != null) {
            attackStrategy.attack(name);
        } else {
            System.out.println(name + " doesn’t know how to attack...");
        }
    }
}
