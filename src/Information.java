import java.util.*;

public class Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name :");
        String Name = sc.nextLine();

        System.out.println("Your Roll No :");
        int Roll = sc.nextInt();

        sc.nextLine(); //Focuse

        System.out.println("Your Branch :");
        String Branch = sc.nextLine();

        System.out.println("\nYour Information");
        System.out.println(Name);
        System.out.println(Roll);
        System.out.println(Branch);
    }
}
