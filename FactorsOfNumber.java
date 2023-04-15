public class FactorsOfNumber {
    public static void main(String[] args) {
        int num = 30;

        System.out.print("Factors of " + num + " are: ");

        for (int i = 1; i <= num; ++i) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
