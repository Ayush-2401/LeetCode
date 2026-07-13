class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] newMat = new int[rows*cols];
        int p = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                newMat[p] = mat[i][j];
                p++;
            }   
        }
        p = 0;
        if((rows*cols==r*c)){
            int[][] ans = new int[r][c];
            for(int i = 0; i<r; i++){
                for(int j = 0; j<c; j++){
                    ans[i][j] = newMat[p];
                    p++;
                }
            }
            return ans;
        }else{
            return mat;
        }
    }
}