    /* Write a program to read a line of text from the console. change the first character of each word to uppercase
    letter and print out the resulting string.  */


import java.util.Scanner;

public class FirstUpper{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("enter line of text: ");
        String line1 = inp.nextLine();
        
        String[] seperate = line1.split(" ");
        StringBuffer line2 = new StringBuffer();

        for(String i : seperate){
            String p = i.substring(0, 1).toUpperCase();
            String q = i.substring(1);

            line2.append(p).append(q).append(" ");
        }

        System.err.println("your new string is: " + line2);

        }

    }
