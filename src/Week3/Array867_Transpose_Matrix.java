package Week3;

/*
*
* 867. Transpose Matrix
Easy

457

300

Add to List

Share
Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.





Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]


Note:

1 <= A.length <= 1000
1 <= A[0].length <= 1000
* */

class Solution867 {
    public int[][] transpose(int[][] A) {
        int row_size = A[0].length;
        int col_size = A.length;

        int[][] res = new int[row_size][col_size];

        for(int row=0; row< col_size; row++){
            for(int col=0; col<row_size;col++){
                res[col][row] = A[row][col];
            }
        }




        return res;
    }
}