public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(8);
        Circle circle3 = new Circle(5, "Red");

        circle1.getRadius();
        circle2.getColour();
        circle3.getArea();

        circle1.toString();

    }
}