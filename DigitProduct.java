
import java.util.Scanner;

public class DigitProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int product = 1;

        while( n != 0 ){
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }
        System.out.println("Product of Digits are = " + product);
        sc.close();
    }
    
}
