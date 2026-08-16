import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of m = ");
        int m = sc.nextInt();

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println( 5 + "x" + i + "=" + ( m * i ));
        }
        sc.close();
    }
}
