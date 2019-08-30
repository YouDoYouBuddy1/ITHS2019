package shapes;

import java.util.Scanner;
import shapes.Circle;
import shapes.Triangle;
import shapes.Rectangle;

public class Shapes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Choose a shape:\n1.Circle\n2.Rectangle\n3.Triangle\n0.Exit");
            String inputShape = sc.nextLine();

            switch (inputShape) {
                case "1":
                    try {
                        System.out.print("Input radius: ");
                        double radius = Double.parseDouble(sc.nextLine());
                        
                        Circle c = new Circle(radius);
                        System.out.println("Area: " + c.area() + ", Circumference: " + c.circumference());
                    } catch (NumberFormatException e) {
                        System.out.println("Numbers only!");
                    }

                    break;
                case "2":
                    try {
                        System.out.print("Input base: ");
                        double base = Double.parseDouble(sc.nextLine());
                        System.out.print("Input Height: ");
                        double height = Double.parseDouble(sc.nextLine());
                        
                        Rectangle r = new Rectangle(base,height);
                        System.out.println("Area: " + r.area() + ", Circumference: " + r.circumference());
                    } catch (NumberFormatException e) {
                        System.out.println("Numbers only!");
                    }
                    
                    break;
                case "3":
                    try {
                        System.out.print("Input the length of side 1: ");
                        double sideLength1 = Double.parseDouble(sc.nextLine());
                        System.out.print("Input the length of side 2: ");
                        double sideLength2 = Double.parseDouble(sc.nextLine());
                        System.out.print("Input the length of side 3: ");
                        double sideLength3 = Double.parseDouble(sc.nextLine());
                        
                        Triangle t = new Triangle(sideLength1,sideLength2,sideLength3);
                        System.out.println("Area: " + t.area() + ", Circumference: " + t.circumference());
                    } catch (NumberFormatException e) {
                        System.out.println("Numbers only!");
                    }
                    
                    break;
                case "0":
                    exit = true;
                    System.out.println("Goodbye");
                    break;
                default:
                    break;
            }

        }
    }

}
