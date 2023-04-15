public class UpLowSpecialChar
{
    public static void main(String[] args)
    {
        char c = '@'; // character to check
        if(c>='a' && c<='z')
        {
            System.out.println("The character is lowercase");
        }
        else if(c>='A' && c<='Z'){
            System.out.println("The character is uppercase");
        }
        else{
            System.out.println("The character is a special character");
        }
    }
}
