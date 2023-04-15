import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String removedVowelsStr = "";

        for (char c : str.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                removedVowelsStr += c;
            }
        }

        System.out.println("The string with vowels removed is: " + removedVowelsStr);
    }
}
