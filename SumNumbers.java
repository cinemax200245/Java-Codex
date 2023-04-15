import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string containing numbers: ");
        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("Sum of numbers in the string: " + sum);
    }
}
