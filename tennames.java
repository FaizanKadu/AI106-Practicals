/* A set of 10 names is given. write a program to delete the first three characters of the names and arrange the
resulting names in alphabetical order and print them out. */

import java.util.ArrayList;
public class tennames {
public static void main(String[] args) {
    String[] names = { "Faizan", "Abbas", "sUGANDH"};

    ArrayList<String> list  = new ArrayList<String>();

    for(String i: names){
        System.out.println(i);

        list.add(i.substring(4));

    }

    
    for(String i: list){
        System.out.println(i);


    }
}

}
