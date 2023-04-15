public class ReverseOfANumber
{
    public static void main(String[] args) {
        int num = 12345;
        int num1=num;
        int rem=0;
        int reverse = 0;
        while(num != 0){
            rem=num%10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        System.out.println("The reverse of " + num1 + " is " + reverse);

    }
}
