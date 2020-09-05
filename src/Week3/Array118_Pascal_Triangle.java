package Week3;

/*
* 118. Pascal's Triangle
Easy

1700

118

Add to List

Share
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
*
* In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
* */


import java.util.ArrayList;
import java.util.List;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for(int i=1; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prev_row = triangle.get(i-1);

            row.add(1);

            for(int j=1; j < i; j++ ){
                row.add(prev_row.get(j-1) + prev_row.get(j) );
            }

            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }
}