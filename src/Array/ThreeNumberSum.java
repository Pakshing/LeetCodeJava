package Array;

import java.util.*;
public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] arr, int targetSum) {
        // Write your code here.
        //O(n^2) time | O(n) space
        if(arr.length < 3) return new ArrayList<Integer[]>();

        Arrays.sort(arr);
        int left =0;
        int mid = left+1;
        int right =arr.length-1;
        ArrayList<Integer[]> res= new ArrayList<>();

        while (left < arr.length-2){
            while(mid < right){
                int curSum = arr[left] + arr[mid] + arr[right];
                if(curSum == targetSum){
                    res.add(new Integer[] {arr[left],arr[mid],arr[right]});
                    mid++;
                }
                else if(curSum > targetSum){
                    right--;
                }else if(curSum < targetSum){
                    mid++;
                }
            }
            left++;
            mid = left+1;
            right = arr.length-1;
        }

        if(res.size() > 0) return res;

        return new ArrayList<Integer[]>();
    }
}
