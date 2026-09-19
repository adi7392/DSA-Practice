
import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for( int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }
        boolean[] counted = new boolean[n];

        for( int i = 0; i < n; i++ ){
            if(counted[i]){
                continue;
            }
            int count = 1;

        for( int j = i + 1; j < n; j++ ){
            if(arr[i] == arr[j]){
                count++;
                counted[j]=true;
            }
        }
        System.out.println(arr[i] + " = " + count);
        }
        sc.close();
    }
}
