// =============================================================
// Write java program to second highest number in an array
// =============================================================

class Question5{

    public static void main(String args[]){
        //find second highest number in array

        int arr[] = { 1, 2, 3, 4, 5};

        // Initial value to be minimum integer value
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
 
        for(int i = 0; i < arr.length; i++) {
            
            if(arr[i] > max) {
                second_max = max; // old max value is now second max value
                 max = arr[i]; // setting new max value
            }
 
            if(max > arr[i] && arr[i] > second_max) {
                second_max=arr[i];
            }
        }

        System.out.println("Second max value: "+ second_max);
    }
}