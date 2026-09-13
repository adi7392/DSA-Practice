import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence = ");
        String str = sc.nextLine();

        int word = 0;
        boolean inWord = false;

        for( int i = 0; i < str.length(); i++ ){
            char ch = str.charAt(i);

            if(ch != ' ' && !inWord){
                word++;
                inWord = true;
            }else if(ch == ' '){
                inWord = false;
            }
        }
        System.out.println("Number os Words = " + word);
        sc.close();
    }
}
