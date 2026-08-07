//ith bit from end of a number..Using bitmasking
//Ex: 1001101 5th bit is 0

import java.util.Scanner;
public class IthBitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary number : ");
        int binary = sc.nextInt();

        System.out.print("Enter ith bit : ");
        int i = sc.nextInt();

        int mask = (1 << (i-1));
        int bit = (binary & mask);        
        System.out.printf("%d bit in the %d is %d",i , binary , bit);
        sc.close();
    }
}
