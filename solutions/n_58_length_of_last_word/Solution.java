package n_58_length_of_last_word;

//58. Length of Last Word leetcode.com problem
//https://leetcode.com/problems/length-of-last-word/


class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        String text = s.trim();
        if (s.isEmpty()) return 0;

        String [] arr = text.split(" ");

        return arr[arr.length-1].length();
    }
}