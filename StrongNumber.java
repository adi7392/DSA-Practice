
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int sum = 0;
        int original = n;

        while( n != 0){
            int digit = n % 10;
            int factorial = 1;
            for ( int i = 1; i <= digit; i++ ){
                factorial = factorial * i;
            }
            sum = sum + factorial;
            n = n / 10;
        }
        if ( sum == original ){
            System.out.println( original + " is a Strong Number");
        }else{
            System.out.println( original + " is not a Strong Number");
        }
        sc.close();
    }
}
