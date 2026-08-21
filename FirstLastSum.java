
import java.util.Scanner;

public class FirstLastSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int lastdigit = n % 10;
        
        while ( n >= 10 ){
            n = n / 10;
        }
        int firstdigit = n;

        int sum = firstdigit + lastdigit;

        System.out.println("First Digit = " + firstdigit);
        System.out.println("Last Digit = " + lastdigit);
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
