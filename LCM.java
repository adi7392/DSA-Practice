
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number = ");
        int b = sc.nextInt();

        int lcm = 1;

        for( int i = 1; i <= a*b; i++ ){
            if( i % a == 0 && i % b == 0 ){
                lcm = i;
                break;
            }
        }
        System.out.println("LCM of " + a + " & " + b + " " + "= " + lcm);
        sc.close();
    }
}
