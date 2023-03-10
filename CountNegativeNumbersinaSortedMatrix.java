package LeetCode;//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix

public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args)
    {
        int[][] grid1 = { {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}  };
        int[][] grid2 = { {3,2}, {1,0}  };

        System.out.println("1 : "+countNegatives(grid1));
        System.out.println("2 : "+countNegatives(grid2));
    }

    public static int countNegatives(int[][] grid) {
        int negCount = 0;

        for ( int[] arr : grid)
        {
            int length = arr.length - 1;
            while (length >= 0 && arr[length] < 0)
            {
                negCount++;
                length--;
            }
        }
        return negCount;
    }
}
