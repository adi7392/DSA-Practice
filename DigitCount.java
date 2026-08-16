
import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int count = 0;

        if (n == 0) {
           count = 1;
        } else {
        while (n != 0) {
           n = n / 10;
           count++;
          }
        }
        System.out.println("Number of Digits = " + count);
        sc.close();
    }
}
