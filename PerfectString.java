import java.util.Scanner;

public class PerfectString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("type to check perfect string : ");
        String text = input.nextLine();

        boolean isPerfect = true;
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isPerfect = false;
                    break;
                }
            }
        }

        if (isPerfect) {
            System.out.println("Every character is unique.");
        } else {
            System.out.println("characters repeat.");
        }
    }
}
