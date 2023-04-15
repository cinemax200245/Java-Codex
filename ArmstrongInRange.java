import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        for (int num = lower; num <= upper; num++) {
            int temp = num;
            int sum = 0;
            int n = String.valueOf(num).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, n);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
