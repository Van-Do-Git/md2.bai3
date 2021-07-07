import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string are you want to check");
        String a = input.nextLine();
        System.out.println("Input a character are you want to count");
        char character = input.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (character == a.charAt(i)) {
                count++;
            }
        }
        System.out.printf("Character\t %s appear\t %d times", character, count);
    }
}
