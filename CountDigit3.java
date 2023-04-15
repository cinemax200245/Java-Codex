import java.util.Scanner;

public class CountDigit3 {
    public static int countDigit3(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 3) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static int countDigit3InRange(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += countDigit3(i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = countDigit3InRange(n);
        System.out.println("Number of times digit 3 occurs from 0 to " + n + ": " + count);
    }
}
