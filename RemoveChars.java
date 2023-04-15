import java.util.Scanner;

public class RemoveChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = str.replaceAll("[^a-zA-Z]", "");
        System.out.println("String after removing non-alphabets: " + result);
    }
}
