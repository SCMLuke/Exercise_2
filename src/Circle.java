public class Circle {
    private double radius;
    private String colour;

    public Circle () {
        this.radius=2;
        this.colour="Green";
    }
    public Circle (double radius) {
        this.radius=radius;
        this.colour="Green";
    }
    public Circle (double radius, String colour) {
        this.radius=radius;
        this.colour=colour;
    }
    public String getColour() {
        return colour;
    }
    public double getRadius() {
        return radius;
    }
    public void getArea() {
        double area = Math.PI*(radius*radius);
        System.out.println("Area of circle is: "+area);
    }
    public String toString() {
        System.out.println("Radius = "+radius+" Colour = "+colour);
        return null;
    }

}
