
import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String = ");
        String str = sc.nextLine();

        String uppercase = "";
        String lowercase = "";

        for( int i = 0; i < str.length(); i++ ){
            char ch = str.charAt(i);
            
            if ( ch >= 'a' && ch <= 'z' ){
                uppercase = uppercase + (char)(ch - 32);
            }else{
                uppercase = uppercase + ch;
            }
            if ( ch >= 'A' && ch <= 'Z' ){
                lowercase = lowercase + (char)( ch + 32 );
            }else{
                lowercase = lowercase + ch;
            }
        }
        System.out.println("Uppercase = " + uppercase);
        System.out.println("Lowercase = " + lowercase);
        sc.close();
    }
}
