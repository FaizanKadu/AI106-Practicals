

import java.util.ArrayList;
import java.util.Collections;

public class names {
    public static void main(String[] args) {
        String[] names = {"faizan", "rohit", "mohan", "Sanjay", "gajendra purohit"};

        ArrayList<String> p = new ArrayList<String>();

        for( String i : names){
            p.add(i.substring(3));
        }

        System.out.println("--UNSORTED--");
        for( String i : p){
            System.out.println(i);
        }

        Collections.sort(p);
        System.out.println("--SORTED--");
        for( String i : p){
            System.out.println(i);
        }
        
    }
    
}
