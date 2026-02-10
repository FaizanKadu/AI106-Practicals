public class HexCheck {
    public static void main(String args[]) {
        String s = "12A9";
        boolean isValid = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'))) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("It is ahex number");
        } else {
            System.out.println("Not");
        }
        System.out.println("Endingthe program");
    }
}
