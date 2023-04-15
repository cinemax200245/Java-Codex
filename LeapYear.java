public class LeapYear {
    public static void main(String[] args) {
        int year = 2004;
        boolean isLeap = false;
        if(year % 4 == 0){
            if(year % 100 == 0 && year%400!=0){
                {
                    isLeap = true;
                }
            }
            else{
                isLeap = true;
            }
        }
        if(isLeap==true){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
