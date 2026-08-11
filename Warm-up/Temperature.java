
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Celsius = sc.nextDouble();

        double fahrenheit = (9.0/5.0) * Celsius + 32;

        System.out.println("Fahrenheit = " + fahrenheit);

        sc.close();

    }
}
