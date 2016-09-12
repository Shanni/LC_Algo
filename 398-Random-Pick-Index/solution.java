public class Solution {

    int[] nums;
    Random r=new Random();
    int len;
    
    public Solution(int[] nums) {
        this.nums=nums;
        len=nums.length;
    }
    
    public int pick(int target) {
        int temp=r.nextInt(len);
        while(nums[temp]!=target){
            temp=r.nextInt(len);
        }
        return temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */