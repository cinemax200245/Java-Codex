public class AddFractions {
    public static void main(String[] args) {
        int num1 = 1, den1 = 4;
        int num2 = 2, den2 = 5;

        // Find the common denominator
        int commonDenominator = den1 * den2;

        // Add the numerators with the common denominator
        int numerator = num1 * den2 + num2 * den1;

        // Simplify the result
        int gcd = gcd(numerator, commonDenominator);
        int sumNum = numerator / gcd;
        int sumDen = commonDenominator / gcd;

        System.out.println("The sum of " + num1 + "/" + den1 + " and " + num2 + "/" + den2 + " is " + sumNum + "/" + sumDen);
    }

    // Method to find the GCD of two numbers
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
