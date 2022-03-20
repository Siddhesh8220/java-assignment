// ==================================================================
// Write a java program to find duplicate characters in string
// ==================================================================

import java.util.*;

class Question4{
    public static void main(String args[]){

        String str = "aahjbjkkjhkjhkjhkjkjuguigiufytdtdrtdysrdtfytft";

        // Hashmap to store chracter and its count
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < str.length(); i++){
            char key = str.charAt(i);
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            }
            else{
                map.put(key, 1);
            }
		}

        // Iterator to iterate over map
        Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
		    HashMap.Entry record = (HashMap.Entry)it.next();
		    if((int)record.getValue()>1){
		        System.out.println("character: " + record.getKey() + ", Occurence: " + record.getValue());
		    }
		}

    }
}