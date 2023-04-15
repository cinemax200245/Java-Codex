import java.util.Scanner;

public class PrimeNumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        for (int num = lower; num <= upper; num++) {
            boolean isPrime = true;

            if (num == 0 || num == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime == true)
                System.out.print(num + " ");
        }
    }
}
