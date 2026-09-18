
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int even = 0;
        int odd = 0;

        for( int j = 0; j < n; j++ ){
            if(arr[j] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of Even elements = " + even);
        System.out.println("Number of Odd elements = " + odd);
        sc.close();
    }
}
