package LeetCode;
//https://leetcode.com/problems/flood-fill


public class Flood_Fill {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,0}};
        int[][] ans = floodFill(image, 1,1,2);
        for (int[] row : ans) {
            for (int col : row)
                System.out.print(col);
            System.out.println();
        }

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] seen = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, seen, image[sr][sc], color);
        return image;
    }

    private static void dfs(int[][] image, int i, int j, boolean[][] seen, int startColor, int newColor) {
        if (i < 0 || i == image.length || j < 0 || j == image[0].length)
            return;
        if (image[i][j] != startColor || seen[i][j])
            return;

        image[i][j] = newColor;
        seen[i][j] = true;

        dfs(image, i + 1, j, seen, startColor, newColor);
        dfs(image, i - 1, j, seen, startColor, newColor);
        dfs(image, i, j + 1, seen, startColor, newColor);
        dfs(image, i, j - 1, seen, startColor, newColor);
    }
}
