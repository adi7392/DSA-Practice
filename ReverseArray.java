
import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        
        for( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse Array : ");
        for( int j = n - 1; j >= 0; j-- ){
            System.out.print(arr[j] + " ");
        }
        sc.close();
    }
}