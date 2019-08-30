package shapes;

public class Circle {

    private final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return getRadius() * getRadius() * PI;
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
