import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int evencount = 0;
        int oddcount = 0;

        while ( n != 0 ){
            int digit = n % 10;
            if ( digit % 2 == 0){
                evencount++;
            }else{
                oddcount++;
            }
            n = n / 10;
        }
        System.out.println("Even count = " + evencount);
        System.out.println("Odd count = " + oddcount);
        sc.close();
    }
}
