package Array;
import java.util.*;
public class MonotonicArray {
    public static boolean isMonotonic(int[] arr) {
        // Write your code here.
        if(arr.length <2) return true;
        boolean isIncreasing = false;

        int i=1;
        //check for increasing or decreasing
        while(i<arr.length-1 && arr[i]== arr[i-1]) i++;
        if(i== arr.length-1) return true;

        if(arr[i]>arr[i-1]){
            isIncreasing = true;
        }else{
            isIncreasing = false;
        }

        for(int j=i; j< arr.length; j++){
            if(isIncreasing == true){
                if(arr[j] < arr[j-1]) return false;
            }else{
                if(arr[j] > arr[j-1]) return false;
            }
        }



        return true;
    }
}
