import java.util.Scanner;
public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int count = 0;
        while(num > 0) {
            if((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }

        System.out.println("Number of set bits are : " + count);
        sc.close();
    }
}
