public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 25;
        int sq = num * num;

        while(num > 0) {
            if(num % 10 != sq % 10) {
                System.out.println(num + " is not an automorphic number.");
                return;
            }
            num /= 10;
            sq /= 10;
        }

        System.out.println(num + " is an automorphic number.");
    }
}
