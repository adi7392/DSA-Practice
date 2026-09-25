
import java.util.Scanner;

public class CountPrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number = ");
        int n = sc.nextInt();

        int count = 0;

        while(n > 0){
            int digit = n % 10;

            if(digit == 2 || digit == 3 || digit == 5 || digit == 7){
                count++;
            }
            n = n / 10;
        }
        System.out.println("Number of Prime Digits = " + count);
        sc.close();
    }
}
