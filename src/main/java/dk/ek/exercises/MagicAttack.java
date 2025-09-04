package dk.ek.exercises;

public class MagicAttack implements IAttackStrategy {
    @Override
    public void attack(String name) {
        System.out.println(name + " casts a powerful fireball!");
    }
}

