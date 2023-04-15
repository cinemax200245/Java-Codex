import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int digit = decimal % 8;
            octal.append(digit);
            decimal /= 8;
        }

        System.out.println("The octal equivalent is: " + octal.reverse().toString());
    }
}
