package dk.ek.exercises.solid;

/**
 * Refactor so Switch depends on an abstraction, not on LightBulb.
 * (Hint: create a Switchable interface.)
 */
public class DIP {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);

        lightSwitch.operate(true);  // Turn on the light
        lightSwitch.operate(false); // Turn off the light

    }
    private static class LightBulb {
        public void turnOn() { System.out.println("LightBulb on"); }
        public void turnOff() { System.out.println("LightBulb off"); }
    }

    private static class Switch {
        private LightBulb bulb;

        public Switch(LightBulb bulb) {
            this.bulb = bulb;
        }

        public void operate(boolean on) {
            if (on) bulb.turnOn();
            else bulb.turnOff();
        }
    }

}
