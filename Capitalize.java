import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            char first = Character.toUpperCase(word.charAt(0));
            char last = Character.toUpperCase(word.charAt(word.length() - 1));
            result += first + word.substring(1, word.length() - 1) + last + " ";
        }
        System.out.println("String with first and last letter capitalized: " + result.trim());
    }
}
