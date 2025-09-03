package dk.ek.exercises.solid;

/**
 * Refactor so that:
 * Adding new discount types doesn’t require modifying DiscountCalculator.
 * Hint: Use an interface or abstract class for DiscountPolicy.
 */
public class OCP {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        double studentPrice = calculator.calculate("student", 100);
        double seniorPrice = calculator.calculate("senior", 100);
        double regularPrice = calculator.calculate("regular", 100);

        System.out.println("Student Price: " + studentPrice);
        System.out.println("Senior Price: " + seniorPrice);
        System.out.println("Regular Price: " + regularPrice);
    }
    private static class DiscountCalculator {
        public double calculate(String type, double price) {
            if (type.equals("student")) {
                return price * 0.9;
            } else if (type.equals("senior")) {
                return price * 0.8;
            } else {
                return price;
            }
        }
    }

}
