import java.util.Scanner;
public class q1 {
 public static void main (String []args)
 {
   System.out.println("program 1");
   Scanner sc = new Scanner(System.in);
   System.out.println("enter no 1 : ");
   int num1 = sc.nextInt();
   System.out.println("enter no 2 : ");
   int num2 = sc.nextInt();

   int sum = num1 + num2 ;
   int diff = num1 - num2 ;
   int product = num1*num2;
   float qutoinent = (num1/num2) ;

   System.out.println("the sum is : " +sum );
   System.out.println("the diff is : " +diff);
   System.out.println("the product is " +product);
   System.out.println("the qutionent " +qutoinent);



 }
}
