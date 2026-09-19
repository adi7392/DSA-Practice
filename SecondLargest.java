
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondlargest = arr[0];

        for(int j = 1; j < n; j++){
            if(arr[j] > largest){
                secondlargest = largest;
                largest = arr[j];
            }
            else if(arr[j] > secondlargest && arr[j] != largest){
                secondlargest = arr[j];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondlargest);
        sc.close();
    }
}
