package Array;

/*
15. 3Sum
Medium

8500

917

Add to List

Share
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []


Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
Accepted
1.1M
Submissions
4M
* */


/*
Algorithm

The implementation is straightforward - we just need to modify twoSumII to produce triplets and skip repeating values.

For the main function:

Sort the input array nums.
Iterate through the array:
If the current value is greater than zero, break from the loop. Remaining values cannot sum to zero.
If the current value is the same as the one before, skip it.
Otherwise, call twoSumII for the current position i.
For twoSumII function:

Set the low pointer lo to i + 1, and high pointer hi to the last index.
While low pointer is smaller than high:
If sum of nums[i] + nums[lo] + nums[hi] is less than zero, increment lo.
If sum is greater than zero, decrement hi.
Otherwise, we found a triplet:
Add it to the result res.
Decrement hi and increment lo.
Increment lo while the next value is the same as before to avoid duplicates in the result.
Return the result res.
* */
import java.util.*;
public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
                if (i == 0 || nums[i - 1] != nums[i]) {
                    twoSumII(nums, i, res);
                }
            return res;
        }
        void twoSumII(int[] nums, int i, List<List<Integer>> res) {
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (sum < 0) {
                    ++lo;
                } else if (sum > 0) {
                    --hi;
                } else {
                    res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                    while (lo < hi && nums[lo] == nums[lo - 1])
                        ++lo;
                }
            }
        }
    }
}
