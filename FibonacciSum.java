
import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n = ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for( int i = 1; i <= n; i++ ){
            sum = sum + a;
            System.out.print( a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
        
        System.out.print( " = " + sum);
        sc.close();
    }
}
