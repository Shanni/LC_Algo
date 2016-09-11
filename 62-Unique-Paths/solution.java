public class Solution {
    public int uniquePaths(int m, int n) {
        int[] ary=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            ary[i]=1;
        }
        for(int j=1;j<m;j++){
            for(int i=1;i<n;i++){
                sum=ary[i];
                ary[i]=ary[i-1]+sum;
            }
        }
        return ary[n-1];
    }
}