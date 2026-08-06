//Checking whether a number is even or not using bitwise operators
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println((n & 1) == 0 ? "Even Number" : "Odd Number");
        sc.close();
    }
}