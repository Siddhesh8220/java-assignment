// ========================================================================================
// 3.Write a method that takes  a List<String> and applies String.trim to each element.
// ========================================================================================

import java.util.*;
import java.util.stream.Collectors;

class Question3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr= new ArrayList<String>();
        System.out.println("Enter number of inputs:");
        int count = sc.nextInt();
        // taking list of strings as input
        System.out.println("Enter sentence:");
        while(count >=0 ){
            arr.add(sc.nextLine());
            count--;
        }
        System.out.println("Without trim: "+arr);

        // trmming strings to remove white spaces
        List<String> res = arr.stream().map(e->e.trim()).collect(Collectors.toList());
		System.out.println("With trim: "+res);
    }
}
