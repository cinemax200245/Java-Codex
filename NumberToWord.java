import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9999: ");
        int number = sc.nextInt();
        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (number == 0) {
            System.out.println("Zero");
        } else if (number < 0 || number > 9999) {
            System.out.println("Invalid input!");
        } else {
            int thousand = number / 1000;
            int hundred = (number / 100) % 10;
            int ten = (number / 10) % 10;
            int unit = number % 10;
            System.out.print("In words: ");
            if (thousand != 0) {
                System.out.print(units[thousand] + " Thousand ");
            }
            if (hundred != 0) {
                System.out.print(units[hundred] + " Hundred ");
            }
            if (ten == 1) {
                System.out.println(units[ten * 10 + unit]);
            } else {
                if (ten != 0) {
                    System.out.print(tens[ten] + " ");
                }
                if (unit != 0) {
                    System.out.println(units[unit]);
                }
            }
        }
    }
}
