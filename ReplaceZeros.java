import java.util.Scanner;
public class ReplaceZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int result = 0;
        int digit;
        int multiplier = 1;

        while (num != 0) {
            digit = num % 10;
            if (digit == 0) {
                digit = 1;
            }
            result += digit * multiplier;
            multiplier *= 10;
            num /= 10;
        }

        System.out.println("The new integer is: " + result);
    }
}
