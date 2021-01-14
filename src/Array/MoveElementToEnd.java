package Array;
import java.util.*;
public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> arr, int toMove) {
        // Write your code here.
        int left=0;
        int right=arr.size()-1;

        while(left<right){
            while(left<right && arr.get(right) == toMove) right--;
            if(arr.get(left) == toMove){
                swap(left,right,arr);
            }
            left++;
        }

        return arr;
    }


    public static void swap(int left, int right, List<Integer> arr){
        int temp = arr.get(left);
        arr.set(left,arr.get(right));
        arr.set(right,temp);
    }
}
