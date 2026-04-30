// Abstract class
abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * (l*b + b*h + l*h);
    }

    double volume() {
        return l * b * h;
    }
}

class Cube extends ThreeDObject {
    double a;

    Cube(double a) {
        this.a = a;
    }

    double wholeSurfaceArea() {
        return 6 * a * a;
    }

    double volume() {
        return a * a * a;
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double volume() {
        return Math.PI * r * r * h;
    }
}

class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }

    double volume() {
        return (Math.PI * r * r * h) / 3;
    }
}
class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ThreeDObject obj;

        System.out.println("1.Box 2.Cube 3.Cylinder 4.Cone");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter l b h: ");
                obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                break;

            case 2:
                System.out.print("Enter side: ");
                obj = new Cube(sc.nextDouble());
                break;

            case 3:
                System.out.print("Enter r h: ");
                obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
                break;

            case 4:
                System.out.print("Enter r h: ");
                obj = new Cone(sc.nextDouble(), sc.nextDouble());
                break;

            default:
                return;
        }

        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Volume: " + obj.volume());
    }
}
