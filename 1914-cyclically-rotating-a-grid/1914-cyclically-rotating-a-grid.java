class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int layers = Math.min(m, n) / 2;

        for(int layer = 0; layer < layers; layer++){
            java.util.List<Integer> list = new java.util.ArrayList<>();

            int top = layer, bottom = m - layer - 1;
            int left = layer, right = n - layer - 1;

            // top row
            for(int j = left; j <= right; j++) list.add(grid[top][j]);

            // right column
            for(int i = top + 1; i <= bottom; i++) list.add(grid[i][right]);

            // bottom row
            for(int j = right - 1; j >= left; j--) list.add(grid[bottom][j]);

            // left column
            for(int i = bottom - 1; i > top; i--) list.add(grid[i][left]);

            int size = list.size();
            int rot = k % size;

            // rotate list
            java.util.List<Integer> rotated = new java.util.ArrayList<>();
            rotated.addAll(list.subList(rot, size));
            rotated.addAll(list.subList(0, rot));

            int idx = 0;

            // put back
            for(int j = left; j <= right; j++) grid[top][j] = rotated.get(idx++);
            for(int i = top + 1; i <= bottom; i++) grid[i][right] = rotated.get(idx++);
            for(int j = right - 1; j >= left; j--) grid[bottom][j] = rotated.get(idx++);
            for(int i = bottom - 1; i > top; i--) grid[i][left] = rotated.get(idx++);
        }

        return grid;
    }
}