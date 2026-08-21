import java.util.Scanner;

public class ReplaceZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int result = 0;
        int place = 1;

        while ( n != 0 ){
            int digit = n % 10;
            if ( digit == 0 ){
                digit = 5;
            }
            result = result + digit * place;
            place = place * 10;
            n = n / 10;
        }
        System.out.println("Result = " + result);
        sc.close();

    }
}
