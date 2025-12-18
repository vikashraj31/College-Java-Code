package Lab3;
import java.util.Scanner;


class Sheet2D {
    double l, b;

    Sheet2D(double length, double breadth) {
        l = length;
        b = breadth;
    }

    double getCost() {
        return l * b * 40;
    }
}


class Box3D extends Sheet2D {
    double h;

    Box3D(double length, double breadth, double height) {
        super(length, breadth); // Parent class ko dimensions dena
        h = height;
    }

    double getCost() {
        return l * b * h * 60;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Sheet Length and Breadth: ");
        Sheet2D s = new Sheet2D(sc.nextDouble(), sc.nextDouble());
        System.out.println("Sheet Cost = Rs " + s.getCost());


        System.out.print("\nEnter Box Length, Breadth and Height: ");
        Box3D b = new Box3D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box Cost = Rs " + b.getCost());

        sc.close();
        k
    }
}