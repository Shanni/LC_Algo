public class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] array=new int[length];
        for(int[] update: updates){
            array[update[0]]+=update[2];
            if(update[1]+1<length)
                array[update[1]+1]-=update[2];
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<length;i++){
            array[i]+=array[i-1];
            if(array[i]>max)
                max=array[i];
        }
        return array;
    }
}