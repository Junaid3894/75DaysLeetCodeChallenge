class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        // Step 1: rotate
        char[][] res = new char[n][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                res[j][m - 1 - i] = box[i][j];
            }
        }

        // Step 2: gravity
        for(int col = 0; col < m; col++){
            int emptyRow = n - 1;

            for(int row = n - 1; row >= 0; row--){
                if(res[row][col] == '*'){
                    emptyRow = row - 1;
                }
                else if(res[row][col] == '#'){
                    char temp = res[row][col];
                    res[row][col] = '.';
                    res[emptyRow][col] = '#';
                    emptyRow--;
                }
            }
        }

        return res;
    }
}