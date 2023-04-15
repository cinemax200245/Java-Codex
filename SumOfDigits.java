public class SumOfDigits
{
    public static void main(String[] args) {
        int num = 12345;
        int num1=num;
        int rem=0;
        int sum=0;
        while(num != 0)
        {
            rem = num % 10;
            sum+=rem;
            num /= 10;
        }
        System.out.println("The sum of digits of " + num1 + " is " + sum);

    }
}
