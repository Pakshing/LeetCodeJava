package Week3;

/*
1394. Find Lucky Integer in an Array
Easy

231

8

Add to List

Share
Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.

Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.



Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
Example 4:

Input: arr = [5]
Output: -1
Example 5:

Input: arr = [7,7,7,7,7,7,7]
Output: 7


Constraints:

1 <= arr.length <= 500
1 <= arr[i] <= 500
* */

class Solution1394 {
    public int findLucky(int[] arr) {
        int[] arr2 = new int[500];
        int largest = -1;
        for(int i=0; i < arr.length; i++){
            arr2[ arr[i] ] += 1;
        }
        for(int i=1; i < arr2.length; i++){
            if(i==arr2[i]){
                if(i>largest) largest = i;
            }
        }
        return largest;
    }
}