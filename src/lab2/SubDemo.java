package lab2;

class Subtract {
    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    double subtract(double a, double b) {
        return a - b;
    }
}

public class SubDemo {
    public static void main(String[] args) {

        Subtract s = new Subtract();

        System.out.println("Subtract (int, int): " + s.subtract(10, 4));
        System.out.println("Subtract (int, int, int): " + s.subtract(20, 5, 3));
        System.out.println("Subtract (double, double): " + s.subtract(5.5, 2.2));
    }
}
