import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter a password to check -");
        String pass = input.nextLine();

        boolean hasLower = false;
        boolean hasdigit = false;
        boolean hasIllegal = false;
        boolean hasPattern = false;

        if (pass.length() < 5 || pass.length() > 12) {
            System.out.println("the length must be between 5 and 12 charactars");
            return;
        }

        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasdigit = true;
            else hasIllegal = true;

            if (i > 0 && c == pass.charAt(i - 1)) {
                hasPattern = true;
            }
        }

        if (hasLower && hasdigit && !hasIllegal && !hasPattern) {
            System.out.println("is a valid password.");
        } else {
            System.out.println(" password doesn't follow our rules");
        }
    }
}
