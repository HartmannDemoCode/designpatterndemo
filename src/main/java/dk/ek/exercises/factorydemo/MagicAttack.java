package dk.ek.exercises.factorydemo;

import dk.ek.exercises.factorydemo.IAttackStrategy;

public class MagicAttack implements IAttackStrategy {
    @Override
    public void attack(String name) {
        System.out.println(name + " casts a powerful fireball!");
    }
}

