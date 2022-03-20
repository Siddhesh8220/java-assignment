// ===============================================================================================================
// Write a program that prints its arguments  in random order. Do not make  a copy of the argument array. 
// Demonstrate  how to print out the elements  using both streams  and the traditional enhanced for statement.
// ===============================================================================================================

import java.util.*;
class Question1{
    public static void main(String args[]){
        // list of arguments
        List<String> argList = Arrays.asList(args);
        
        // get shuffle list of arguments
        Collections.shuffle(argList);
		
        // printing using streams
        System.out.println("Using streams:");
		argList.stream().forEach(element->System.out.print(element+" "));

        // printing using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
		for(String s:argList) {
			System.out.print(s+" ");
		}
    }
}