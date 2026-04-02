import java.util.Scanner;

class Point {
    int x, y;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();
    }

    void display() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

class Circle {
    double radius;
    Point center; 

    void accept() {
        Scanner sc = new Scanner(System.in);
        center = new Point();   
        center.accept();

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    void display() {
        center.display();
        System.out.println("Radius: " + radius);
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.accept();
        System.out.println("\nCircle Details:");
        c.display();
    }
}
