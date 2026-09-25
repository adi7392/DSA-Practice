
import java.util.Scanner;

public class PrimeMethod {
    static boolean isPrime(int num){
        if( num < 2 ){
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

        System.out.print("Enter a Number = ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
        sc.close();
    }
}
