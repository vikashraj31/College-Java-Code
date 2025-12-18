package lab2;
import java.util.*;

class Student {
    int roll;
    String name;
    double cgpa;
}

class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] s = new Student[n];

        for(int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.print("Enter roll: ");
            s[i].roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            s[i].name = sc.nextLine();

            System.out.print("Enter cgpa: ");
            s[i].cgpa = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nStudent Details:");
        for(int i = 0; i < n; i++) {
            System.out.println(s[i].roll + "  " + s[i].name + "  " + s[i].cgpa);
        }

        int index = 0;
        for(int i = 1; i < n; i++) {
            if(s[i].cgpa < s[index].cgpa) {
                index = i;
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + s[index].name);
    }
}
