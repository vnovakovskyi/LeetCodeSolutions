package n_3211_generate_binary_strings_without_adjacent_zeros;

//3211. Generate Binary Strings Without Adjacent Zeros
//https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/description/


import java.util.ArrayList;
import java.util.List;

public class Solution {

    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(validStrings(3));
        System.out.println(validStrings(1));
    }

    public static List<String> validStrings(int n) {
        generate("0", 1, n);
        generate("1", 1, n);
        return result;
    }

    private static void generate(String curr, int pos, int n) {

        if (pos == n) {
            result.add(curr);
            return;
        }

        if (curr.charAt(pos-1) == '0') {
            generate(curr + "1", pos + 1, n);
        } else {
            generate(curr + "0", pos + 1, n);
            generate(curr + "1", pos + 1, n);
        }
    }
}
