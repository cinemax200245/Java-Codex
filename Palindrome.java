public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int reversedNum = 0;
        int originalNum = num;
        while(num != 0){
            int rem = num % 10;
            reversedNum = (reversedNum * 10) + rem;
            num /= 10;
        }
        if(originalNum == reversedNum){
            System.out.println(originalNum + " is a palindrome number.");
        }
        else{
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }
}
