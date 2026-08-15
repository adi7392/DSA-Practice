
import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int sum = 0;

        for( int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of all Even Numbers are = " + sum);
        sc.close();
    }
    
}
