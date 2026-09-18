
import java.util.Scanner;

public class LargestSmallest {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the number of Elements = ");
         int n = sc.nextInt();

         int[] arr = new int[n];

         System.out.println("Enter " + n + " elements: ");

         for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
         }
         int largest = arr[0];
         int smallest = arr[0];

         for(int j = 1; j < n; j++){
            if(arr[j] > largest){
                largest = arr[j];
            }
            if(arr[j] < smallest){
                smallest = arr[j];
            }
         }
         System.out.println("Largest = " + largest);
         System.out.println("Smallest = " + smallest);
         sc.close();
     }
}
