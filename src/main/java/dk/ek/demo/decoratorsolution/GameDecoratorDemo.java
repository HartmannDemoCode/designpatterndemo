package dk.ek.demo.decoratorsolution;


import dk.ek.demo.strategydemosolution.GameCharacter;

public class GameDecoratorDemo {
    public static void main(String[] args) {
        IGameCharacter aragorn = new BasicHero("Aragorn");
        aragorn = new StrongDecorator(aragorn);
        aragorn = new ArmoredDecorator(aragorn);

        IGameCharacter legolas = new BasicHero("Legolas");
        legolas = new ArmoredDecorator(legolas);

        System.out.println(aragorn.getDescription() + " Power: " + aragorn.getPower());
        System.out.println(legolas.getDescription() + " Power: " + legolas.getPower());
    }
}
