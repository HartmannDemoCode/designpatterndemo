package dk.ek.exercises;

public class BowAttack implements IAttackStrategy {
    @Override
    public void attack(String name) {
        System.out.println(name + " shoots a precise arrow!");
    }
}

