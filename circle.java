
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Radius = sc.nextDouble();

        double Area = Math.PI*Radius*Radius;
        double Circumference = 2*Math.PI*Radius;

        System.out.println("Area ="+ Area);
        System.out.println("Circumference ="+ Circumference);

        sc.close();
    }
}
