import java.util.Scanner;

public class SumOfPrimes {
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean found = false;

        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " can be expressed as the sum of " + i + " and " + (num - i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(num + " cannot be expressed as the sum of two prime numbers.");
        }
    }
}
