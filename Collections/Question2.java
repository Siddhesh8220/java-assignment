// ================================================================================================
// 2.Take  the FindDupsexample  and modify it to use  a SortedSet  instead of a Set. 
// Specify a Comparator so that case  is ignored when sorting and identifying set elements.
// ================================================================================================

import java.util.*;

public class Question2{
    public static void main(String[] args) {

        // Sorted with with comparator to ignore case
        SortedSet<String> s = new TreeSet<String>(new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        }});


        //printing using enhanced for loop
        for (String a : args)
        { 
            s.add(a);
        }
        System.out.println(s);
    }
}
