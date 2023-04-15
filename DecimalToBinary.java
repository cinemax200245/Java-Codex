import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int bit = decimal % 2;
            binary.append(bit);
            decimal /= 2;
        }

        System.out.println("The binary equivalent is: " + binary.reverse().toString());
    }
}
