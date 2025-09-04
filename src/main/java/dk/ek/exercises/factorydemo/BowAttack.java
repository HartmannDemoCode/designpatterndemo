package dk.ek.exercises.factorydemo;

import dk.ek.exercises.factorydemo.IAttackStrategy;

public class BowAttack implements IAttackStrategy {
    @Override
    public void attack(String name) {
        System.out.println(name + " shoots a precise arrow!");
    }
}

