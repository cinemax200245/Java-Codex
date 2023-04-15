import java.util.Scanner;

public class PalindromicPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            int num = i;
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            num = 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
