// ================================================================================
// Write a Java Program to iterate HashMap using While and advance for loop.
// ================================================================================

import java.util.*;

class Question1{
    public static void main(String args[]){
        // Hashmap with string key and integer value
        HashMap<String, Integer> map = new HashMap<>();

        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        //Iterate using advanced for
        System.out.println("Iteration using advanced for loop:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //Iterate using while loop
        System.out.println("\nIteration using while loop:");
        Iterator  it = map.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry record = (HashMap.Entry)it.next();
            System.out.println(record.getKey() + " = "+ record.getValue());
        }
    }
}