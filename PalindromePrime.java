
import java.util.Scanner;

public class PalindromePrime{
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
    static boolean isPalindrome(int num){
        int original = num;
        int reverse = 0;

        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number = ");
        int n = sc.nextInt();

        if(isPrime(n) && isPalindrome(n)){
            System.out.println("Number is Palindrome Prime");
        }else{
            System.out.println("Number is not Palindrome Prime");
        }
        sc.close();
    }
}