package shapes;

import java.util.Scanner;

public class Shapes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n===============");
            System.out.println("     Menu\n===============\n1.Circle\n2.Rectangle\n3.Triangle\n0.Exit");
            System.out.println("===============");
            System.out.print("Make a choice: ");
            String inputShape = sc.nextLine();

            switch (inputShape) {
                case "1":
                    try {
                        System.out.print("Input radius: ");
                        double radius = Double.parseDouble(sc.nextLine());
                        System.out.println("\n");

                        Circle c = new Circle(radius);
                        pickOutput(c.area(), c.circumference());
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
                        System.out.println("\n");

                        Rectangle r = new Rectangle(base, height);
                        pickOutput(r.area(), r.circumference());
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
                        System.out.println("\n");

                        Triangle t = new Triangle(sideLength1, sideLength2, sideLength3);
                        pickOutput(t.area(), t.circumference());
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

    private static void pickOutput(double area, double circumference) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Show area\n2.Show circumference\n3.Show both");
        System.out.print("Make a choice: ");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Area: " + area);
                break;
            case 2:
                System.out.println("Circumference: " + circumference);
                break;
            case 3:
                System.out.println("Area: " + area + ", Circumference: " + circumference);
                break;
            default:
                break;
        }
    }

}
