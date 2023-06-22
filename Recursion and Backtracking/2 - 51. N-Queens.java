public class Solution {

    public static List<String> construct(char[][] board){

        List<String> res = new LinkedList<String>();

        for(int i=0; i<board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }

        return res;

    }

    public static boolean isValid(char[][] board, int x, int y){

        for(int i=0; i<board.length; i++){
            for(int j=0; j<y; j++){
                if(board[i][j] == 'Q' && (x + j == y + i || x + y == i + j || x == i)){
                    return false;
                }
            }
        }
        
        return true;

    }

    public static void helper(char[][] board, int j, List<List<String>> ma){

        if(j == board.length){
            ma.add(construct(board));
            return;
        }
        
        for(int i=0; i<board.length; i++){
            if(isValid(board, i, j)){
                board[i][j] = 'Q';
                helper(board, j + 1, ma);
                board[i][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n){

        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> ma = new ArrayList<List<String>>();

        helper(board, 0, ma);

        return ma;

    }
    
}
