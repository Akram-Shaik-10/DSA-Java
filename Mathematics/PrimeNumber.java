import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(primeCheck(n) ? "Prime number" : "Not prime number");
        sc.close();
    }

    private static boolean primeCheck(int n) {
        if(n == 1) return false;

        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}