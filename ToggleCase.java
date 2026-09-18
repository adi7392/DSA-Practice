
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String = ");
        String str = sc.nextLine();

        String result = "";

        for( int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if( ch >= 'a' && ch <= 'z' ){
                result = result + Character.toUpperCase(ch);
            }else if( ch >= 'A' && ch <= 'Z' ){
                result = result + Character.toLowerCase(ch);
            }else{
                result = result + ch;
            }
        }
        System.out.println("Updated String = " + result);
        sc.close();
    }
}
