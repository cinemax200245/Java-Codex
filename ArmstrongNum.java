public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;

        while(num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num = num / 10;
        }

        if(originalNum == sum)
            System.out.println(originalNum + " is an Armstrong number.");
        else
            System.out.println(originalNum + " is not an Armstrong number.");
    }
}
