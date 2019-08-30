package shapes;

public class Triangle {

    private double sideLength1 = 1.0;
    private double sideLength2 = 1.0;
    private double sideLength3 = 1.0;

    public Triangle(double sideLength1, double sideLength2, double sideLength3) {
        if (sideLength1 > 0 && sideLength2 > 0 && sideLength3 > 0) {
            if (sideLength1 <= sideLength2 + sideLength3 && sideLength2 <= sideLength1 + sideLength3 && sideLength3 <= sideLength2 + sideLength1) {
                this.sideLength1 = sideLength1;
                this.sideLength2 = sideLength2;
                this.sideLength3 = sideLength3;
            } else {
                System.out.println("!!! Impossible shape, using default values\n");
            }
        } else {
            System.out.println("!!! Invalid side length, using defaults\n");
        }

    }

    public double circumference() {
        return sideLength1 + sideLength2 + sideLength3;
    }

    public double area() {
        double p = (sideLength1 + sideLength2 + sideLength3) / 2;
        return Math.sqrt(p * (p - sideLength1) * (p - sideLength2) * (p - sideLength3));
    }

    public double getSideLength1() {
        return sideLength1;
    }

    public void setSideLength1(double sideLength1) {
        this.sideLength1 = sideLength1;
    }

    public double getSideLength2() {
        return sideLength2;
    }

    public void setSideLength2(double sideLength2) {
        this.sideLength2 = sideLength2;
    }

    public double getSideLength3() {
        return sideLength3;
    }

    public void setSideLength3(double sideLength3) {
        this.sideLength3 = sideLength3;
    }
}
