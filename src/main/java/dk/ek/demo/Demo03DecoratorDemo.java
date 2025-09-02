package dk.ek.demo;

/**
 * Demonstrates the Decorator Pattern by showing how subclassing to add features
 * can lead to a combinatorial explosion of classes.
 * We get the following issues:
 * 1. Class explosion: Each combination of features requires a new subclass.
 * 2. Rigid hierarchy: Inflexible to add/remove features at runtime.
 * 3. Code duplication: Shared logic may be duplicated across subclasses.
 * 4. Maintenance nightmare: Changes require touching many classes.
 */
public class Demo03DecoratorDemo {

    public static void main(String[] args) {
        // If we want special versions, we need new classes:
        StrongCharacter strongHero = new StrongCharacter("Aragorn");
        ArmoredCharacter armoredHero = new ArmoredCharacter("Legolas");

        System.out.println(strongHero.getDescription() + " Power: " + strongHero.getPower());
        System.out.println(armoredHero.getDescription() + " Power: " + armoredHero.getPower());
    }

    // Base character
    private static class BasicCharacter {
        private String name;

        public BasicCharacter(String name) {
            this.name = name;
        }

        public String getDescription() {
            return name;
        }

        public int getPower() {
            return 10; // default base power
        }

    }

    // Subclassing to add features (bad, not scalable)
    private static class StrongCharacter extends BasicCharacter {
        public StrongCharacter(String name) {
            super(name);
        }

        @Override
        public String getDescription() {
            return super.getDescription() + " [Strong]";
        }

        @Override
        public int getPower() {
            return super.getPower() + 20;
        }
    }

    private static class ArmoredCharacter extends BasicCharacter {
        public ArmoredCharacter(String name) {
            super(name);
        }

        @Override
        public String getDescription() {
            return super.getDescription() + " [Armored]";
        }

        @Override
        public int getPower() {
            return super.getPower() + 15;
        }
    }
}

