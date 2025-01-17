package n_3285_find_indices_of_stable_mountains;

//3285. Find Indices of Stable Mountains
//https://leetcode.com/problems/find-indices-of-stable-mountains/description/


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println((stableMountains(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println((stableMountains(new int[]{10, 1, 10, 1, 10}, 3)));
        System.out.println((stableMountains(new int[]{10, 1, 10, 1, 10}, 10)));
        System.out.println((stableMountains(new int[]{10, 1, 10, 1, 10}, 0)));
        System.out.println((stableMountains(new int[]{10, 1, 10, 0, 4, 7, 3, 0, 9, 2, 10, 10}, 5)));
    }

    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> mountains = new ArrayList<>();

        for (int i = 1; i < height.length; ++i) {
            if (height[i - 1] > threshold) {
                mountains.add(i);
            }
        }

        return mountains;
    }
}
