import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your text");
        String text = input.nextLine();
        System.out.print("Enter limit number - ");
        int n = input.nextInt();

        int[] counts = new int[256];

        for (int i = 0; i < text.length(); i++) {
            counts[text.charAt(i)]++;
        }

        System.out.println(" characters observed more than " + n + " times");
        for (int i = 0; i < 256; i++) {
            if (counts[i] > n) {
                System.out.println((char) i + " appeared " + counts[i] + " times ");
            }
        }
    }
}
