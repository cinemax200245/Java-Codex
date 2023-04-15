import java.util.Scanner;

public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an algebraic expression: ");
        String expression = sc.nextLine();
        expression = expression.replaceAll("\\(|\\)", "");
        System.out.println("Expression after removing brackets: " + expression);
    }
}
