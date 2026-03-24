import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();
      
        int firstIndex = input.indexOf("the");
        int lastIndex = input.lastIndexOf("the");

        if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex) {
            
            int start = firstIndex + "the".length();
            String result = input.substring(start, lastIndex);

            System.out.println("Characters beteen the first and last 'the':");
            System.out.println(""" + result + "'");
            
        } else {
            System.out.println("The word 'the must appear at least twice");
        }

        scanner.close();
    }
}
