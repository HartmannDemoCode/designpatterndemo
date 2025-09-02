# Exercise for 2. sem students at EK
## Design patterns: Strategy, Factory and Decorator

- You are given three pieces of poorly designed game code. Your task is to refactor each into a cleaner, extensible implementation using the correct design pattern.
- Patterns to apply:
  - Strategy Pattern → Flexible attack styles
  - Factory Pattern → Centralized character creation
  - Decorator Pattern → Adding powers dynamically

## Part 1 — Strategy Pattern: Attacks
- Provided “bad code”: to refactor:
  - A GameCharacter uses a giant if-else block to decide how to attack:
```java
if ("WARRIOR".equalsIgnoreCase(type)) {
    System.out.println(name + " swings a mighty sword!");
} else if ("MAGE".equalsIgnoreCase(type)) {
    System.out.println(name + " casts a powerful fireball!");
} else if ("ARCHER".equalsIgnoreCase(type)) {
    System.out.println(name + " shoots a precise arrow!");
}
```
### Refactoring Steps
1. Create an AttackStrategy interface with an attack(String name) method.
2. Implement at least three strategies: SwordAttack, MagicAttack, BowAttack.
3. Modify GameCharacter to hold an AttackStrategy instead of type.
4. Add a method setAttackStrategy() so characters can switch attacks at runtime.
5. Demonstrate in GameDemo:
  - Create Aragorn (sword), 
  - Gandalf (magic), 
  - Legolas (bow).
6. Print their attacks.
7. Change Gandalf’s attack to sword mid-game.

#### Reflection Question
- Why is the new design easier to extend with a new attack type (e.g., StealthAttack)?

## Part 2 — Factory Pattern: Character Creation
- Provided “bad code” to refactor:
  - Object creation scattered with messy if-else blocks:
```java
if ("WARRIOR".equalsIgnoreCase(type)) {
    new GameCharacter("Aragorn", new SwordAttack());
} else if ("MAGE".equalsIgnoreCase(type)) {
    new GameCharacter("Gandalf", new MagicAttack());
}
```
### Refactoring Steps
- Create a CharacterFactory class.
- Implement a static createCharacter(String type, String name) method.
- Move object creation logic (e.g., new GameCharacter(name, new SwordAttack())) into the factory.
- Replace if-else creation in client code with CharacterFactory.createCharacter().
#### Bonus (advanced):
- Replace switch with a registry map (Map<String, Function<String, GameCharacter>>).
- Allow new character types to be registered dynamically.

#### Reflection Question
- How does the Factory help enforce the Single Responsibility Principle (SRP)?
- In the registry approach, how does it better uphold the Open/Closed Principle?

## Part 3 — Decorator Pattern: Character Upgrades
- Provided “bad code” to refactor:
- Subclassing to add features:
```java
class StrongCharacter extends BasicCharacter { ... }
class ArmoredCharacter extends BasicCharacter { ... }
```
- Leads to class explosion (StrongArmoredCharacter, MagicStrongArmoredCharacter, etc.)
#### Refactoring Steps:
1. Extract a GameCharacter interface with getDescription() and getPower().
2. Create BasicHero as the base implementation.
3. Create an abstract CharacterDecorator class that wraps another GameCharacter.
4. Implement concrete decorators:
  - StrongDecorator → adds +20 power
  - ArmoredDecorator → adds +15 power

5. In GameDecoratorDemo:
- Create Aragorn → add StrongDecorator + ArmoredDecorator.
- Create Legolas → add only ArmoredDecorator.
- Print descriptions and powers.

#### Reflection Question
- How does Decorator reduce the number of classes compared to inheritance?
- What happens if you chain multiple decorators (e.g., Strong + Armored + Stealth)?
- Subclassing to add features:

## Extra Challenge (Optional)
- Add new attack type → StealthAttack.
- Add new character type → Assassin.
- Add new decorator → FlyingDecorator (+30 power).
- Show how the system can handle all these without modifying existing code.