import java.util.Scanner;

public class QuadrantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter the y-coordinate: ");
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ") lies in the First Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ") lies in the Second Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("(" + x + ", " + y + ") lies in the Third Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("(" + x + ", " + y + ") lies in the Fourth Quadrant.");
        } else {
            System.out.println("(" + x + ", " + y + ") lies on the origin.");
        }
    }
}
