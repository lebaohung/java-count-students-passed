import java.util.Scanner;
public class Main {
    static final int TARGET = 5;
    static int count ;
    public static void main(String[] args) {
        int[] a ;
        int size ;
        System.out.println("COUNT PASSING STUDENTS.");

        System.out.print("Enter size of list ( maximum 30): ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        while (size > 30 || size < 2 ) {
            System.out.print("Invalid! Please enter again: ");
            size = scanner.nextInt();
        }
        a = new int[size];
        System.out.println("Enter list of student scores: ");
        for ( int value : a) {
            value = scanner.nextInt();
            if (check(value)) count++;
        }
        System.out.println("The number of students passing the exam: " + count);
    }
    public static boolean check(int score) {
        if (score > TARGET) {
            return  true;
        }
        else {
            return false;
        }
    }
}
