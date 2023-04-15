public class SumOfNumInARange
{
    public static void main(String[] args) {
        int start = 15;
        int end = 30;
        int sum = 0;
        for(int i=start; i<=end; i++){
            sum += i;
        }
        System.out.println("The sum of numbers in the range " + start + " to " + end + " is " + sum);

    }
}
