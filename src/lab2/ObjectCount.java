package lab2;
import java.util.*;

class Demo {
    static int count = 0;

    Demo() {
        count++;
    }
}

public class ObjectCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many objects you want to create: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            new Demo();
        }

        System.out.println("Number of objects created = " + Demo.count);
    }
}
