import java.util.Scanner;

// Define the abstract shape class
abstract class Shape {
    float area;//Incapsulation
    abstract public void inputParameters();//Abstract method
    abstract public void compute();
    public void display() {
        System.out.println("The area is " + area);
    }
}

// Define the square class
class Square extends Shape {
    private float length;

    public void inputParameters() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square");
        length = scan.nextFloat();
        // Don't close the Scanner here
    }

    public void compute() {
        area = length * length;
    }
}

// Define the rectangle class
class Rectangle extends Shape {
    private float length;
    private float width;

    public void inputParameters() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        length = scan.nextFloat();
        System.out.println("Enter the width of rectangle");
        width = scan.nextFloat();
        // Don't close the Scanner here
    }

    public void compute() {
        area = length * width;
    }
}

// Define the circle class
class Circle extends Shape {
    private float radius;

    public void inputParameters() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = scan.nextFloat();
        // Don't close the Scanner here
    }

    public void compute() {
        area = (float) (Math.PI * radius * radius);
    }
}

// Define the Geometry class
class Geometry {
    public void permit(Shape ref) {
        ref.inputParameters();
        ref.compute();
        ref.display();
    }
}

// Define the Launch class
public class Launch {
    public static void main(String[] args) {
        Square sq = new Square();
        Rectangle re = new Rectangle();
        Circle ci = new Circle();

        Geometry g = new Geometry();
        g.permit(sq);
        g.permit(re);
        g.permit(ci);

        // Close the Scanner after all input is taken
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
