import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter th radius: ");
        int r = input.nextInt();
        
        System.out.println("Diamater is " + (2 * r));
        System.out.println("Circumference is " + (2 * 3.14159 * r));
        System.out.println("Area is " + (3.14159 * r * r));
    }
}
