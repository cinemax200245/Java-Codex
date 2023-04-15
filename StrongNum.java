public class StrongNum {
    public static void main(String[] args) {
        int num = 145;
        int originalNum = num;
        int sum = 0;

        while(num != 0) {
            int rem = num % 10;
            int fact = 1;
            for(int i=1; i<=rem; i++) {
                fact *= i;
            }
            sum += fact;
            num = num / 10;
        }

        if(originalNum == sum)
            System.out.println(originalNum + " is a strong number.");
        else
            System.out.println(originalNum + " is not a strong number.");
    }
}
