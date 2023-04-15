import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String toggledStr = "";

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledStr += Character.toLowerCase(c);
            } else {
                toggledStr += Character.toUpperCase(c);
            }
        }

        System.out.println("The toggled string is: " + toggledStr);
    }
}
