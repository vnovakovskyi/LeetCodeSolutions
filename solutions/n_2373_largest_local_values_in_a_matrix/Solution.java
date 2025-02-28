package n_2373_largest_local_values_in_a_matrix;

//2373. Largest Local Values in a Matrix
//https://leetcode.com/problems/largest-local-values-in-a-matrix/description/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] res = maxLocal(new int[][]{
                new int[]{9, 9, 8, 1},
                new int[]{5, 6, 2, 6},
                new int[]{8, 2, 6, 4},
                new int[]{6, 2, 2, 2}
        });

        System.out.println(Arrays.toString(res[0]));
        System.out.println(Arrays.toString(res[1]));
    }

    public static int[][] maxLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n-2][n-2];

        for(int i = 0; i < n-2; i++) {
            for(int j = 0; j < n-2; j++) {
                int maxVal = Integer.MIN_VALUE;
                for(int r = i; r < i+3; r++) {
                    for(int c = j; c < j+3; c++) {
                        maxVal = Math.max(maxVal, grid[r][c]);
                    }
                }
                result[i][j] = maxVal;
            }
        }

        return result;
    }
}
