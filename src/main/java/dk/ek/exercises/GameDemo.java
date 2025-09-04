package dk.ek.exercises;

public class GameDemo {
    public static void main(String[] args) {
        GameCharacter aragorn = new GameCharacter("Aragorn", new SwordAttack());
        GameCharacter gandalf = new GameCharacter("Gandalf", new MagicAttack());
        GameCharacter legolas = new GameCharacter("Legolas", new BowAttack());

        aragorn.performAttack();
        gandalf.performAttack();
        legolas.performAttack();

        // Change strategy at runtime!
        System.out.println("\nGandalf finds a sword...");
        gandalf.setAttackStrategy(new SwordAttack());
        gandalf.performAttack();
    }
}
