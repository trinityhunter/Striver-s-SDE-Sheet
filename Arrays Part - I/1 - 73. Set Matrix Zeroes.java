class Solution {

    public void setZeroes(int[][] matrix){

        // ***** Time - O(mn(m+n)) && Space - O(1)

        // boolean isZero = false;

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(matrix[i][j] == 0){
        //             isZero = true;
        //             for(int k=0; k<matrix.length; k++){
        //                 if(matrix[k][j] != 0){
        //                     matrix[k][j] = Integer.MIN_VALUE-5;
        //                 }
        //             }
        //             for(int k=0; k<matrix[0].length; k++){
        //                 if(matrix[i][k] != 0){
        //                     matrix[i][k] = Integer.MIN_VALUE-5;
        //                 }
        //             }
        //         }
        //     }
        // }

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(isZero && matrix[i][j] == Integer.MIN_VALUE-5){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // ***** Time - O(mn) && Space - O(1)

		int m = matrix.length;
        
        int n = matrix[0].length;

        boolean isRow0 = false;
        
        boolean isCol0 = false;
        
        for(int j=0; j<n; j++){
            if(matrix[0][j] == 0){
                isRow0 = true;
            }
        }
        
        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0){
                isCol0 = true;
            }
        }
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(isRow0){
            for(int j=0; j<n; j++){
                matrix[0][j] = 0;
            }
        }
        
        if(isCol0){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
        
    }

}
