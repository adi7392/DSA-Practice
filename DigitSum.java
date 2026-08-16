import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int sum = 0;

        while ( n != 0 ){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Total sum of Digits are = " + sum);
        sc.close();

    }
}
