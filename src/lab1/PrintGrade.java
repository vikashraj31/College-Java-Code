package lab1;
import java.util.*;

public class PrintGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Mark : ");
        int Mark = sc.nextInt();

        if (Mark > 89) {
            System.out.println("Your Grade is O");
        } else if (Mark > 79) {
            System.out.println("Your Grade is E");
        } else if (Mark > 69) {
            System.out.println("Your Grade is A");
        } else if (Mark > 59) {
            System.out.println("Your Grade is B");
        } else if (Mark > 49) {
            System.out.println("Your Grade is C");
        } else if (Mark > 39) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("Your Grade is F (You Fail to Pass Exam)");
        }
    }
}
