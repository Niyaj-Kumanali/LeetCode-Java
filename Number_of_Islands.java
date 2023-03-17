package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Number_of_Islands {

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; ++i)
            for (int j = 0; j < grid[0].length; ++j)
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    ++ans;
                }

        return ans;
    }

    private static final int[] dirs = {0, 1, 0, -1, 0};

    private static void bfs(char[][] grid, int r, int c) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {r, c});
        grid[r][c] = '2'; // Mark '2' as visited
        while (!q.isEmpty()) {
            final int i = q.peek()[0];
            final int j = q.poll()[1];
            for (int k = 0; k < 4; ++k) {
                final int x = i + dirs[k];
                final int y = j + dirs[k + 1];
                if (x < 0 || x == grid.length || y < 0 || y == grid[0].length)
                    continue;
                if (grid[x][y] != '1')
                    continue;
                q.offer(new int[] {x, y});
                grid[x][y] = '2'; // Mark '2' as visited
            }
        }
    }
}
