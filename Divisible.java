
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int number = sc.nextInt();

        if ( (number % 3 == 0) && (number % 5 ==0)){
            System.out.println("Number is Divisible by both 3 and 5");
        }else{
            System.out.println("Number is not Divisible by both 3 and 5");
        }

        sc.close();
    }
}
