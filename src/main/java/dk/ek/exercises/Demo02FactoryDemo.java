package dk.ek.exercises;


import dk.ek.exercises.factorydemo.BowAttack;
import dk.ek.exercises.factorydemo.GameCharacter;
import dk.ek.exercises.factorydemo.MagicAttack;
import dk.ek.exercises.factorydemo.SwordAttack;

/**
 * This demo illustrates the drawbacks of not using the Factory Pattern.
 * We get the following issues in the code below:
 * 1: If-else clutter — every time you add a new character type, you add more branches.
 * 2: Duplication risk — object creation logic is scattered across codebase.
 * 3: Violates Single Responsibility — main method does object creation + usage.
 * 4: Hard to maintain — changes require touching many files.
 */
public class Demo02FactoryDemo {
    public static void main(String[] args) {
        run("WARRIOR");
        run("MAGE");
        run("ARCHER");
        run("ASSASSIN"); // Unknown type
        run("SOMETHINGUNKNOWN"); // Unknown type
    }
    public static void run(String type) {

        // Messy if-else to create characters
        if ("WARRIOR".equalsIgnoreCase(type)) {
            GameCharacter warrior = new GameCharacter("Aragorn", new SwordAttack());
            warrior.performAttack();
        } else if ("MAGE".equalsIgnoreCase(type)) {
            GameCharacter mage = new GameCharacter("Gandalf", new MagicAttack());
            mage.performAttack();
        } else if ("ARCHER".equalsIgnoreCase(type)) {
            GameCharacter archer = new GameCharacter("Legolas", new BowAttack());
            archer.performAttack();
        } else {
            System.out.println("Unknown character type!");
        }
    }
}

