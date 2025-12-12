package lab2;
import java.util.*;

//Do again
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int E = 0;
        int O = 0;

        for(int i = 1; i <= 10; i++){
            int n = sc.nextInt();

            if(n % 2 == 0){
                E++;
            } else {
                O++;
            }
        }

        System.out.println("Even count is " + E + ", Odd count is " + O);
    }
}
