
import java.util.Scanner;

public class EvenOddIndexSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int evenSum = 0;
        int oddSum = 0;

        for(int j = 0; j < n; j++){
            if(j % 2 == 0){
                evenSum = evenSum + arr[j];
            }else{
                oddSum = oddSum + arr[j];
            }
        }
        System.out.println("Sum of even-indexed elements = " + evenSum);
        System.out.println("Sum of odd-indexed elements = " + oddSum);
        sc.close();
    }
}
