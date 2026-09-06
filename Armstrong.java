
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int temp = n;
        int original = n;
        int digits = 0;

        while ( temp != 0){
            temp = temp / 10;
            digits++;
        }
        int sum = 0;
        temp = n;

        while ( temp != 0 ){
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }
        if ( sum == original ){
            System.out.println("It is Armstrong Number");
        }else{
            System.out.println("It is not Armstrong Number");
        }
        sc.close();
    }
}
