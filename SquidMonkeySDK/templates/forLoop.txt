import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        int vowels=0,consonants=0;
        String text;
        char character;

        Scanner input = new Scanner(System.in);

        System.out.println("enter your text");
        text = input.nextLine();

        text=text.toLowerCase();

        for(int i=0;i<text.length();i++){
            character=text.charAt(i);

            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                vowels++;
            }
            else
                consonants++;



        }

        System.out.println("vowels: "+vowels +" consonants: "+consonants);
    }
}
