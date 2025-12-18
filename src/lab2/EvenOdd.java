package lab2;
import java.util.*;

class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int Even = 0;
        int Odd = 0;

        for(int i = 1; i <= 10; i++){
            int n = sc.nextInt();

            if(n % 2 == 0){
                Even++;
            } else {
                Odd++;
            }
        }

        System.out.println("Even count is " + Even + ", Odd count is " + Odd);
    }
}
