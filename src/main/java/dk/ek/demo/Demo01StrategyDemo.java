package dk.ek.demo;

/**
 * Strategy Pattern Demo without using the Strategy Pattern
 *
 * Here we have a Character class that can be a Warrior, Mage, or Archer.
 * The attack method uses a big if-else statement to determine the attack behavior
 * based on the character type. This approach is not scalable and violates the Open/Closed Principle.
 * This makes the code:
 * 1: Hard to extend → Adding a new character type (e.g., Assassin) requires editing the if-else.
 * 2: Break the Open/Closed Principle → Class changes every time you add/remove an attack style.
 * 3: Break the Low cohesion principle → Attack logic is mixed inside the character class.
 * 4: Not reusable → Attack styles can’t be reused independently.
 *
 * In a real-world scenario, we would refactor this code to use the Strategy Pattern,
 * where each character type would have its own attack strategy class.
 * So we need to implement:
 * 1: Strategy interface → AttackStrategy { void attack(String name); }
 * 2: Concrete strategies → SwordAttack, MagicAttack, BowAttack.
 * 3: Context class → GameCharacter uses an AttackStrategy.
 * 4: Result → No if-else mess, adding new attacks is easy.
 */
public class Demo01StrategyDemo {

    private static class CharacterWithoutStrategy {
        private String name;
        private String type; // "WARRIOR", "MAGE", "ARCHER"

        public CharacterWithoutStrategy(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public void attack() {
            // Big if-else mess
            if ("WARRIOR".equalsIgnoreCase(type)) {
                System.out.println(name + " swings a mighty sword!");
            } else if ("MAGE".equalsIgnoreCase(type)) {
                System.out.println(name + " casts a powerful fireball!");
            } else if ("ARCHER".equalsIgnoreCase(type)) {
                System.out.println(name + " shoots a precise arrow!");
            } else {
                System.out.println(name + " doesn’t know how to attack...");
            }
        }

    }
    public static void main(String[] args) {
        CharacterWithoutStrategy hero1 = new CharacterWithoutStrategy("Aragorn", "WARRIOR");
        hero1.attack();

        CharacterWithoutStrategy hero2 = new CharacterWithoutStrategy("Gandalf", "MAGE");
        hero2.attack();

        CharacterWithoutStrategy hero3 = new CharacterWithoutStrategy("Legolas", "ARCHER");
        hero3.attack();
    }

}
