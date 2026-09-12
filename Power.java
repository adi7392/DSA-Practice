
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of x = ");
        int x = sc.nextInt();

        System.out.print("Enter the Value of y = ");
        int y = sc.nextInt();

        int result = 1;

        for( int i = 1; i <= y; i++ ){
            result = result * x;
        }
        System.out.println("Result = " + result);
        sc.close();
    }
}
