
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n = ");
        int n = sc.nextInt();

        double sum = 0;

        for( int i = 1; i <= n; i++ ){
            sum = sum + 1.0 / i;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
