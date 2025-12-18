package Lab3;
import java.util.Scanner;


class Plate {
    double l, w;
    Plate(double length, double width) {
        l = length;
        w = width;
        System.out.println("Plate Constructor: Length=" + l + ", Width=" + w);
    }
}

class Box extends Plate {
    double h;
    Box(double length, double width, double height) {
        super(length, width);
        h = height;
        System.out.println("Box Constructor: Height=" + h);
    }
}


class WoodBox extends Box {
    double thick;
    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        thick = thickness;
        System.out.println("WoodBox Constructor: Thickness=" + thick);
    }
}

public class MultiLevelDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length, width, height and thickness: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();


        System.out.println("\n--- Constructor Execution Order ---");
        WoodBox myWoodBox = new WoodBox(l, w, h, t);

        sc.close();
    }
}