package dk.ek.exercises.solid;

public class LSP {
    public static void main(String[] args) {

        Rectangle rc = new Rectangle();
        rc.setWidth(5);
        rc.setHeight(10);
        System.out.println("Area of Rectangle (5x10): " + rc.getArea());

        Rectangle sq = new Square();
        sq.setWidth(5);
        sq.setHeight(10); // This should not be allowed for a square
        System.out.println("Area of Square (5x10): " + sq.getArea()); // Expected 25, but gets 100
    }

    /**
     * Fix the design so Square doesn’t break Rectangle behavior.
     * (Hint: maybe Square and Rectangle shouldn’t share inheritance.)
     */
    private static class Rectangle {
        protected int width;
        protected int height;

        public void setWidth(int w) { this.width = w; }
        public void setHeight(int h) { this.height = h; }
        public int getArea() { return width * height; }
    }

    private static class Square extends Rectangle {
        @Override
        public void setWidth(int w) {
            this.width = w;
            this.height = w;
        }
        @Override
        public void setHeight(int h) {
            this.width = h;
            this.height = h;
        }
    }

}
