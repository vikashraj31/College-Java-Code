package lab1;

import java.util.*;

public class Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name :");
        String Name = sc.nextLine();

        System.out.print("Your Roll No :");
        int Roll = sc.nextInt();

        sc.nextLine(); //Focuse

        System.out.print("Your Branch :");
        String Branch = sc.nextLine();

        System.out.println("\nYour Lab1.Information");
        System.out.println(Name);
        System.out.println(Roll);
        System.out.println(Branch);
    }
}
