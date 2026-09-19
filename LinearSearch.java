
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search = ");
        int search = sc.nextInt();

        boolean found = false;

        for(int j = 0; j < n; j++){
            if(arr[j] == search){
                System.out.println("Element found at index = " + j);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
