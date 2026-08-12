
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year = ");
        int year = sc.nextInt();

    if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
        System.out.println("Given year is Leap Year");
    }else{
        System.out.println("Given year is not Leap Year");
    }
    sc.close();
    }
}
