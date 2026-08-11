import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("Addition = " + sum);
        System.out.println("Subraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);


        sc.close();
    }
}
