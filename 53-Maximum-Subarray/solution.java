public class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, result=Integer.MIN_VALUE;
        for(int i=0; nums.length>i; i++){
            result=Math.max(nums[i]+sum, result);
            sum=Math.max(sum+nums[i], 0);
        }
        return result;
    }
}