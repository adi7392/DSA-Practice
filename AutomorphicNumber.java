import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;
        int square = n * n;
        int digit = 0;

        while ( temp != 0 ){
            temp = temp / 10;
            digit++;
        }
        int power = 1;
        for (int i = 1; i <= digit; i++){
            power = power * 10;
        }
        if( square % power == original ){
            System.out.println(original + " is a Automorphic Number");
        }else{
            System.out.println(original + " is not a Automorphic Number");
        }
        sc.close();
    }
}
