/*202 / 202 test cases passed.
Status: Accepted
Runtime: 15 ms*/
class Solution {
    public int maxSubArray(int[] nums) {
    int res = Integer.MIN_VALUE, sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum = Math.max(sum, 0) + nums[i];
        res = Math.max(res, sum);
    }
    return res;
}  
}