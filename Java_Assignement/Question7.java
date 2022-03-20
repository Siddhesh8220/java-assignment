// ==============================================================
// Given string find first repeated character using stream
// ==============================================================

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Collectors;

class Question7{
    public static void main(String args[]){
        Set<Character> store = new HashSet<Character>();
	    String s = new String("heleyu5ilooqqrqwfqb");
	    Character result =  s.chars()      //string stream
             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
             .entrySet().stream()
             .filter(entry -> entry.getValue() == 1)
             .map(entry -> entry.getKey())
             .findFirst().get();
             
        System.out.println(result);

    }
}