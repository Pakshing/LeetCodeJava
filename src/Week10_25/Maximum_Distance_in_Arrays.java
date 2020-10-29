package Week10_25;


/*
You are given m arrays, where each array is sorted in ascending order. Now you can pick up two integers from two different arrays (each array picks one) and calculate the distance. We define the distance between two integers a and b to be their absolute difference |a - b|. Your task is to find the maximum distance.



Example 1:

Input: arrays = [[1,2,3],[4,5],[1,2,3]]
Output: 4
Explanation: One way to reach the maximum distance 4 is to pick 1 in the first or third array and pick 5 in the second array.
Example 2:

Input: arrays = [[1],[1]]
Output: 0
Example 3:

Input: arrays = [[1],[2]]
Output: 1
Example 4:

Input: arrays = [[1,4],[0,5]]
Output: 4


Constraints:

m == arrays.length
2 <= m <= 104
1 <= arrays[i].length <= 500
-104 <= arrays[i][j] <= 104
arrays[i] is sorted in ascending order.
There will be at most 105 integers in all the arrays.
* */

import java.util.*;
class Solution {

    int absDiff(int a, int b){
        if (a>b)
            return a-b;
        return b-a;
    }

    int big(int a, int b){
        if (a>b)
            return a;
        return b;
    }

    int small(int a, int b){
        if (a<b)
            return a;
        return b;
    }

    public int maxDistance(List<List<Integer>> arrays) {
        int min, max, i, res, cmi, cma;

        min = arrays.get(0).get(0);
        max = arrays.get(0).get(arrays.get(0).size()-1);
        res = 0;

        for(i=1; i<arrays.size(); i++){
            cmi = arrays.get(i).get(0);
            cma = arrays.get(i).get(arrays.get(i).size()-1);

            if(res<absDiff(cmi, max))
                res = absDiff(cmi, max);

            if(res<absDiff(cma, min))
                res = absDiff(cma, min);

            max = big(max, cma);
            min = small(min, cmi);
        }

        return res;

    }
}