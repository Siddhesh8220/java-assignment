// =============================================================================================
// Write a java program to iterate ArrayList using for loop, while loop and advance for loop
// =============================================================================================

import java.util.*;

class Question3{
    public static void main(String args[]){
        //Iterate ArrayList using for, while, adavanced for loop
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		arrlist.add(1);
		arrlist.add(6);
		arrlist.add(4);
		arrlist.add(3);
		arrlist.add(5);
		
		System.out.println("Iteration using advanced for loop");
		for(Integer element: arrlist){
		    System.out.println(element);
		}
		
		System.out.println("\nIteration using for loop");
		for(int i = 0; i < arrlist.size(); i++){
		    System.out.println(arrlist.get(i));
		}
		
		System.out.println("\nIteration using while loop");
		ListIterator<Integer> lt = arrlist.listIterator();
		while(lt.hasNext()){
		    System.out.println(lt.next());
		}
    }
}