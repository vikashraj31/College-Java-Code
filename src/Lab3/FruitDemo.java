package Lab3;

class Fruit {
    void show() {
        System.out.println("Show function of Fruit class");
    }
}

class Banana extends Fruit {
    void show() {
        System.out.println("Show function of Banana class");
    }
}

class Cherry extends Fruit {
    void show() {
        System.out.println("Show function of Cherry class");
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        // Objects for each class
        Fruit f = new Fruit();
        Banana b = new Banana();
        Cherry c = new Cherry();

        // Calling show function of each
        f.show();
        b.show();
        c.show();
    }
}