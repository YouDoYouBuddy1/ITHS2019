package shapes;

public class Rectangle {

    private double base = 1.0;
    private double height = 1.0;

    public Rectangle(double base, double height) {
        if (base > 0 && height > 0) {
            this.base = base;
            this.height = height;
        } else {
            System.out.println("!!! Invalid proportions, using defaults");
        }
    }
    
    public double area(){
        return base*height;
    }
    
    public double circumference(){
        return base*2 + height*2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
