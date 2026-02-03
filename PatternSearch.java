import java.util.Scanner;

public class PatternSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter range a");
        int a = sc.nextInt();
        System.out.print(" enter range b");
        int b = sc.nextInt();
        System.out.print("Enter pattern ");
        int pattern = sc.nextInt();

        int count = 0;
        String patternStr = "" + pattern;

        for (int i = a; i <= b; i++) {
            String currentNum = "" + i;
            if (currentNum.contains(patternStr)) {
                count++;
            }
        }

        System.out.println("The number of times " + pattern + " occurred between " + a + " to" + b + " " + count);
    }
}
