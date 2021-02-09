package Array;

import java.util.*;
public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        //O(nlogn) T | O(1) S
        int minChange = 0;

        Arrays.sort(coins);

        for(int coin:coins){
            if(coin > minChange +1) return minChange+1;
            minChange += coin;

        }



        return minChange + 1;
    }
}
