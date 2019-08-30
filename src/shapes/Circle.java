package shapes;

public class Circle {

    private double radius = 1.0;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("!!! Invalid radius, using default\n");
        }
    }

    public double area() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
