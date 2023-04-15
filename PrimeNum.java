public class PrimeNum {
    public static void main(String[] args) {
        int num = 29;
        int sum = 0;

        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum == 0 && num > 1) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
