package Array;

import java.util.*;
public class SmallestDifference {
    public static int[] smallestDifference(int[] arrOne, int[] arrTwo) {
        // Write your code here.
        //O(nlogn + mlogm ) Time | O(1) space
        int[] smallestPair = new int[2];
        int curSmallest = Integer.MAX_VALUE;
        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);

        int i=0;
        int j=0;

        while(i < arrOne.length && j < arrTwo.length){
            int cur = Math.abs(arrOne[i] - arrTwo[j]);
            if(cur == 0){
                return new int[] {arrOne[i],arrTwo[j]};
            }else if(cur < curSmallest){
                curSmallest = cur;
                smallestPair[0]= arrOne[i];
                smallestPair[1] = arrTwo[j];
            }

            if(arrOne[i] < arrTwo[j]){
                i++;
            }else if (arrTwo[j] < arrOne[i]){
                j++;
            }

        }

        return smallestPair;
    }
}
