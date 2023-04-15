import java.util.Scanner;

public class Permutations {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of seats: ");
        int r = sc.nextInt();

        int permutations = factorial(n) / factorial(n - r);
        System.out.println("Number of permutations: " + permutations);
    }
}
