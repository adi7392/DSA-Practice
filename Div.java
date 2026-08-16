
import java.util.Scanner;

public class Div{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if ( i % 3 == 0 || i % 5 == 0 ){
                System.out.println( i );
            }
        }
        sc.close();
    }
}