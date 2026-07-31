class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> row = new HashSet<>();
        Set<Character> col = new HashSet<>();
        for(int i =0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                else if(row.contains(board[i][j])){
                    return false;
                }else{
                    row.add(board[i][j]);
                }
            }
            row.clear();
        }

        
        for(int i =0; i<9; i++){
            for(int j =0; j<9; j++){
                if(board[j][i] == '.'){
                    continue;
                }else if(col.contains(board[j][i])){
                    return false;
                }else{
                    col.add(board[j][i]);
                }
            }
            col.clear();
        }


        
        Set<Character> mat = new HashSet<>();

int r = 0;

while (r < 9) {

    int c = 0;

    while (c < 9) {

        mat.clear();

        int i = r;

        while (i < r + 3) {

            int j = c;

            while (j < c + 3) {

                if (board[i][j] != '.') {

                    if (mat.contains(board[i][j])) {
                        return false;
                    }

                    mat.add(board[i][j]);
                }

                j++;
            }

            i++;
        }

        c += 3;
    }

    r += 3;
}
return true;
    }
    
}