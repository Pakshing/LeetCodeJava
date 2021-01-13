package Array;

/*
1. Two Sum
Easy

17712

634

Add to List

Share
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 105
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
Accepted
3,504,652
Submissions
7,628,519
* */
import java.util.*;
public class Two_Sum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            HashMap<Integer,Integer> seen = new HashMap<>();

            for(int i=0; i<nums.length;i++){
                int wanted = target - nums[i];
                if(seen.containsKey(wanted)){
                    res[0] = i;
                    res[1] = seen.get(wanted);
                }else{
                    seen.put(nums[i],i);
                }
            }
            return res;
        }
    }

    class Solution2 {
        public int[] twoSum(int[] array, int targetSum) {
            //O(nlogn) & O(1)
            Arrays.sort(array);
            int left=0;
            int right = array.length-1;

            while(left<right){
                int currentSum = array[left]+array[right];
                if(currentSum == targetSum){
                    return new int[] {array[left],array[right]};
                }else if (currentSum < targetSum){
                    left++;
                }else{
                    right--;
                }

            }
            return new int[0];
        }
    }
}

