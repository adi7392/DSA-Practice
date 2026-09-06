import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        for ( int number = 1; number <= n; number++){
            int original = number;
            int temp = number;
            int digits = 0;

            while ( temp != 0 ){
                temp = temp / 10;
                digits++;
            }
            int sum = 0;
            temp = number;
            while ( temp != 0 ){
                int digit = temp % 10;
                sum = sum + (int)Math.pow(digit, digits);
                temp = temp / 10;
            }
            if ( sum == number ){
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
