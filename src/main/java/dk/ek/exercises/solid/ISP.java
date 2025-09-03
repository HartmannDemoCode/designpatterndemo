package dk.ek.exercises.solid;

public class ISP {
    public static void main(String[] args) {
        Worker human = new Human();
        Worker robot = new Robot();

        human.work();
        human.eat();

        robot.work();
        try {
            robot.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println("Robot cannot eat!");
        }

    }
    /**
     * Refactor so that:
     * Human and Robot implement only the methods they need.
     * Hint: Split Worker into more specific interfaces.
     */
    private static interface Worker {
        void work();
        void eat();
    }

    private static class Human implements Worker {
        public void work() { System.out.println("Working..."); }
        public void eat() { System.out.println("Eating..."); }
    }

    private static class Robot implements Worker {
        public void work() { System.out.println("Working..."); }
        public void eat() { throw new UnsupportedOperationException(); }
    }

}
