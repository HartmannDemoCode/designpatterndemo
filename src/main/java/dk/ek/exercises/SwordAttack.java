package dk.ek.exercises;

public class SwordAttack implements IAttackStrategy{
    @Override
    public void attack(String name) {
        System.out.println(name + " swings a mighty sword!");
    }
}
