package dk.ek.exercises.factorydemo;

import dk.ek.exercises.factorydemo.IAttackStrategy;

public class SwordAttack implements IAttackStrategy {
    @Override
    public void attack(String name) {
        System.out.println(name + " swings a mighty sword!");
    }
}
