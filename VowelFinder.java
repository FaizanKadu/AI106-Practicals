import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        System.out.println("\nVowels found and their positions");

        boolean found = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char lowerCh = Character.toLowerCase(ch);

            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println("Vowel: '" + ch + "' at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vowels were found in the input.");
        }

        scanner.close();
    }
}
