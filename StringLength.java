import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int length = 0;

        for (char c : str.toCharArray()) {
            length++;
        }

        System.out.println("The length of the string is: " + length);
    }
}
