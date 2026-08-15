
import java.util.Scanner;

public class ReverseNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int num = sc.nextInt();

        for( int i = num; i >= 1; i-- ){
            System.out.print( i + " " );
        }

        sc.close();
    }
}