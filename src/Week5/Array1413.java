package Week5;

class Solution1413 {
    public int minStartValue(int[] nums) {
        int curSum = 0, min_sum = 0;
        for (var n : nums) {
            curSum += n;
            min_sum = Math.min(min_sum, curSum);
        }
        return 1 - min_sum;
    }
}
