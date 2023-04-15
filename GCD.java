public class GCD {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int lcm = 0, gcd = 0;
        int max = (num1 > num2) ? num1 : num2;

        for(int i = max; i <= num1*num2; i += max){
            if(i%num1 == 0 && i%num2 == 0){
                lcm = i;
                break;
            }
        }

        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }

        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}
