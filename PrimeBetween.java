
import java.util.Scanner;

public class PrimeBetween{
    static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        System.out.println("Prime number between " + a + " and " + b + " : ");

        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.print( i + " ");
            }
        }
        sc.close();
    }
}