
import java.util.Scanner;

public class LargestSmallestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number = ");
        int n = sc.nextInt();

        int[] digits = new int[10];
        int count = 0;

        while(n > 0){
            int digit = n % 10;
            digits[count] = digit;
            count++;
            n = n / 10;
        }
        for(int i = 0; i < count - 1; i++){
            for(int j = i + 1; j < count; j++){
                if(digits[i] > digits[j]){
                    int temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        System.out.print("Smallest Number = ");
        for(int i = 0; i < count; i++){
            System.out.print(digits[i]);
        }
        System.out.print("\nLargest Number = ");
        for(int i = count-1; i >= 0; i--){
            System.out.print(digits[i]);
        }
        sc.close();
    }
}