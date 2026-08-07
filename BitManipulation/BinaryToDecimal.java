//Converting a binary bit to Decimal number
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binary = sc.nextInt();
        int binaryNumber = binary;
        int decimal = 0;

        int i = 0;
        while(binary != 0) { 
            decimal += ((binary % 10)*Math.pow(2 , i));
            i++;
            binary /= 10;
        }

        System.out.printf("Decimal representation of %d is %d",binaryNumber , decimal);
        sc.close();
    }
}
