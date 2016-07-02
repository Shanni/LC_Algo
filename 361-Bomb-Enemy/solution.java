public class Solution {
    public int maxKilledEnemies(char[][] grid) {
        int rows=grid.length, cols=rows>0 ? grid[0].length : 0;
        int[] colhits=new int[cols]; int rowhits=0;
        int result=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || grid[i-1][j]=='W'){
                    colhits[j]=0;
                    for(int k=i; k<rows && grid[k][j]!='W';k++){
                        if(grid[k][j]=='E'){
                            colhits[j]++;
                        }
                    }
                }
                if(j==0 || grid[i][j-1]=='W'){
                    rowhits=0;
                    for(int k=j;k<cols && grid[i][k]!='W';k++){
                        if(grid[i][k]=='E'){
                            rowhits++;
                        }
                    }
                }
                if(grid[i][j]=='0')
                    result=Math.max(result, colhits[j]+rowhits); 
            }
        }
        return result;
    }
}