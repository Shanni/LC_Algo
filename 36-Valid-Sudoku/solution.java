// public boolean isValidSudoku(char[][] board) {
//     for (int i=0; i<9; i++) {
//         if (!isParticallyValid(board,i,0,i,8)) return false;
//         if (!isParticallyValid(board,0,i,8,i)) return false;
//     }
//     for (int i=0;i<3;i++){
//         for(int j=0;j<3;j++){
//             if (!isParticallyValid(board,i*3,j*3,i*3+2,j*3+2)) return false;
//         }
//     }
//     return true;
// }
// private boolean isParticallyValid(char[][] board, int x1, int y1,int x2,int y2){
//     Set singleSet = new HashSet();
//     for (int i= x1; i<=x2; i++){
//         for (int j=y1;j<=y2; j++){
//             if (board[i][j]!='.') if(!singleSet.add(board[i][j])) return false;
//         }
//     }
//     return true;
// }

public class Solution {
    public boolean isValidSudoku(char[][] board) {

        //check rows
        for(int i=0;i<9; i++){
            if(!helper(board,0, i, 9,i+1))
                return false;
        }
        
        //check cols
        for(int j=0;j<9;j++){
            if(!helper(board,j,0,j+1,9))
                return false;
        }
        
        //check squares
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!helper(board,i,j,i+3,j+3))
                    return false;
            }
        }
        return true;
    }
    public boolean helper(char[][] board, int w, int h, int w2, int h2){
        HashSet<Character> set=new HashSet<>();
        for(int i=h; i<h2;i++){
            for(int j=w;j<w2;j++){
                if(set.contains(board[i][j]))
                    return false;
                if(board[i][j]!='.')
                    set.add(board[i][j]);
            }
        }
        return true;
    }
}