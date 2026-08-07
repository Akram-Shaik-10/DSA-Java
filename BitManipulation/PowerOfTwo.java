import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = (int)(Math.log(x) / Math.log(2) +1);

        int i = 1 << (count - 1);

        System.out.println((x ^ i) == 0 ? "Power of 2" : "Not power of 2");

        sc.close();

        // n & (n - 1) == 0 power of 2
    }
}
