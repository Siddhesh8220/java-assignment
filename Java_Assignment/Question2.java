// ===========================================================================
// Write java program to count number of words in a string using HashMap
// ===========================================================================

import java.util.*;

class Question2{
    public static void main(String args[]){

		String str = new String("Hey there how are you hope you are doing well");
		String[] tokens = str.split(" ", -1);

        // Hashmp to store count of words
        HashMap<String,Integer> map = new HashMap<String,Integer>();

		for(int i = 0 ; i < tokens.length ; i++){
            String key = tokens[i];
            // If contains key then increment its value
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            }
            // else add new key with value as 1
            else{
                map.put(key, 1);
            }
		}
		
		System.out.println(map);
        
    }
}