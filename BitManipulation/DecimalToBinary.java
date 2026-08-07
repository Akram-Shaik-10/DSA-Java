import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int decimal = num;
        ArrayList<Integer> binary = new ArrayList<>();

        while(num > 0) {
            binary.add(num % 2);
            num /= 2;
        }
        
        Collections.reverse(binary);

        System.out.print("Binary form of " + decimal + " is : ");
        for ( int n : binary) {
            System.out.print(n);
        }
        sc.close();
    }
}
