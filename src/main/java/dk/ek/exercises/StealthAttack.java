package dk.ek.exercises;

public class StealthAttack implements IAttackStrategy {
    @Override
    public void attack(String name) {
        System.out.println(name + " Sneaks up and cut the throat!");
    }
}

