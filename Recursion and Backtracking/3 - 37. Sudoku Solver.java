class Solution {

    public static boolean isValid(char[][] board, int num, int sr, int sc){

        for(int i=0; i<board.length; i++){
            if(board[i][sc]-'0' == num){
                return false;
            }
        }

        for(int j=0; j<board[0].length; j++){
            if(board[sr][j]-'0' == num){
                return false;
            }
        }

        sr = 3*(sr/3);
        sc = 3*(sc/3);

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == (char)(num + '0')){
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean helper(char[][] board){

        int sr = 0;

        int sc = 0;

        boolean flag = true;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == '.'){
                    sr = i;
                    sc = j;
                    flag = false;

                    break;
                }
                if(!flag){
                    break;
                }
            }
        }

        if(flag){
            return true;
        }

        for(int i=1; i<=9; i++){
            if(isValid(board, i, sr, sc)){
                board[sr][sc] = (char)(i+'0');

                if(helper(board)){
                    return true;
                }
                else{
                    board[sr][sc] = '.';
                }
            }
        }

        return false;

    }

    public void solveSudoku(char[][] board) {
        
        helper(board);

    }

}
