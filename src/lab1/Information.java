package lab1;

import java.util.*;

public class Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name :");
        String name = sc.nextLine();

        System.out.print("Your Roll No :");
        int roll = sc.nextInt();

        sc.nextLine(); //Focuse

        System.out.print("Your Branch :");
        String branch = sc.nextLine();

        System.out.println("\nYour Lab1.Information");
        System.out.println(name);
        System.out.println(roll);
        System.out.println(branch);
    }
}
