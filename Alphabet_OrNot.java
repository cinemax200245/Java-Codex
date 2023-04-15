public class Alphabet_OrNot
{
    public static void main(String[] args) {
        char c='0';
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            System.out.println("The character is an alphabet");
        }
        else{
            System.out.println("The character is not an alphabet");
        }
    }
}
