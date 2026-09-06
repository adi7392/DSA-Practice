import java.util.Scanner;

public class FirstNPrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N = ");
        int n = sc.nextInt();

        int count = 0;
        int number = 2;
        

        while( count < n ) {
            int divisorCount = 0;
            for ( int i = 1 ; i <= number; i++){
                if( number % i == 0 ){
                    divisorCount++;
                }
            }
            if ( divisorCount == 2){
                System.out.println(number + "");
                count++;
            }
            number++;
        }
        sc.close();
    }
}