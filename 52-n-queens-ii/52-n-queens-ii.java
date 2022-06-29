class Solution {
    int count =0;
    public int totalNQueens(int n) {
        
      boolean[][] board = new boolean[n][n];
      boolean[] cols = new boolean[n];
      boolean[] ndiag = new boolean[2 * n - 1];
      boolean[] odiag = new boolean[2 * n - 1];
      queen(board, 0, cols, ndiag, odiag);
      return count;
    }
    public void queen (boolean[][]board, int row, boolean[]cols, boolean[] ndiag,boolean[] odiag){
        
        if(row==board.length){
            count++;
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(cols[col]==false && ndiag[row+col]==false && odiag[row-col+board.length-1]==false){
                board[row][col] =true;
                cols[col] = true;
                ndiag[row+col] =true;
                odiag[row-col+board.length-1] =true;
                queen(board,row+1,cols,ndiag,odiag);
                board[row][col] =false;
                cols[col] = false;
                ndiag[row+col] =false;
                odiag[row-col+board.length-1] =false;
            }
        }
        return;
}
}