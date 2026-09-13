import java.util.Scanner;

public class VowelConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String = ");
        String str = sc.nextLine();

        int vowel = 0;
        int consonent = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));

            if( ch >= 'a' && ch <= 'z' ){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                }else{
                    consonent++;
                }
            }
        }
        System.out.println("Number of vowel = " + vowel);
        System.out.println("Number of Consonent = " + consonent);
        sc.close();
    }
}
