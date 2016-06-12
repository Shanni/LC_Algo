public class Solution {
    public int rob(int[] nums) {
        int num1=0, num2=0; //num1: select the last number; num2 not selecting the last one
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                num1=Math.max(num1+nums[i],num2);
            }else{
                num2=Math.max(num2+nums[i],num1);
            }
        }
        return Math.max(num1, num2);
    }
}