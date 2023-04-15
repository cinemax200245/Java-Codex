public class NumOfDigits
{
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        while(num != 0){
            count++;
            num /= 10;
        }
        System.out.println("The number of digits in " + num + " is " + count);
    }
}
