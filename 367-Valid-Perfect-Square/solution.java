public class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=1; num>0; i=i+2){
            num-=i;
            if(num==0)
                return true;
        }
        return false;
    }
}