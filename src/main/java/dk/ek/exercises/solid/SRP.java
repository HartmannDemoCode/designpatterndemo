package dk.ek.exercises.solid;

public class SRP {
    public static void main(String[] args) {
        Report report = new Report();
        String text = report.getText();
        report.saveToFile("report.txt");
        report.print();

    }

    /**
     * Refactor so that:
     * Report handles only the data.
     * File saving and printing are handled by separate classes.
     */
    private static class Report {
        public String getText() {
            return "Annual financial report";
        }

        public void saveToFile(String filename) {
            // writes text to file
        }

        public void print() {
            // prints report
        }
    }

}
