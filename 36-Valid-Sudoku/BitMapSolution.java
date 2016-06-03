

public class Solution {
   public boolean isValidSudoku(char[][] board) {
    BitSet bit = new BitSet(243);
    for (int r=0; r<9; r++) {
        for (int c=0; c<9; c++) {
            if (board[r][c] == '.') continue;
            int val = board[r][c] - '1';
            int h = r*9 + val;
            if (!checkBit(bit,h)) return false;
            int v = c*9 + val + 81;
            if (!checkBit(bit, v)) return false;
            int s = ((r/3) * 3 + c/3) * 9 + val + 162;
            if (!checkBit(bit, s)) return false;
        }
    }
    return true;
}

public boolean checkBit(BitSet bitSet, int pos) {
    if (bitSet.get(pos)){
        return false;
    } else {
        bitSet.set(pos);
        return true;
    }
}

}