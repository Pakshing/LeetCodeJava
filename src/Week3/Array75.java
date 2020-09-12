package Week3;

/*
75. Sort Colors
Medium

3923

235

Add to List

Share
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Follow up:

Could you solve this problem without using the library's sort function?
Could you come up with a one-pass algorithm using only O(1) constant space?


Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
Example 3:

Input: nums = [0]
Output: [0]
Example 4:

Input: nums = [1]
Output: [1]


Constraints:

n == nums.length
1 <= n <= 300
nums[i] is 0, 1, or 2.
* */

class Solution57a {
    public void sortColors(int[] nums) {
        int[] holders = new int[3];

        for(int i=0; i < nums.length; i++){
            holders[ nums[i] ]+=1;
        }

        int[] res = new int[nums.length];
        int p1 = 0;

        for(int i=0; i< holders.length; i++){
            int count = holders[i];
            for(int j=0; j < count; j++){
                nums[p1] = i;
                p1++;
            }
        }

    }
}
class Solution57b {
    public void sortColors(int[] nums) {
        // 1-pass
        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
    }
}



