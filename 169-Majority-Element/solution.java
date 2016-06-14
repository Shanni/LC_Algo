public class Solution {
    public int majorityElement(int[] nums) {
        int majority=0, counter=0;
        for(int num: nums){
            if(majority==num)
                counter++;
            else{
                if(counter==0){
                     majority=num;
                }
                else{
                    counter--;
                }
            }
        }
        return majority;
    }
}