import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = Integer.parseInt(String.valueOf(binary.charAt(i)));
            decimal += bit * Math.pow(2, power);
            power++;
        }

        System.out.println("The decimal equivalent is: " + decimal);
    }
}
