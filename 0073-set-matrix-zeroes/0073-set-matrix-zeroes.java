class Solution {
    public void setZeroes(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        boolean[] zeroRows = new boolean[r];
        boolean[] zeroCols = new boolean[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = 0;
                }
            }
        }


        for (int j = 0; j < c; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < r; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}