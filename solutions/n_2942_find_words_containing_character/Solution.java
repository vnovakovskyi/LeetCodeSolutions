package n_2942_find_words_containing_character;

//2942. Find Words Containing Character
//https://leetcode.com/problems/find-words-containing-character/description/


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"leet", "code"}, 'e'));
        System.out.println(findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a'));
        System.out.println(findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z'));

        System.out.println(findWordsContaining_IndexOf(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z'));
    }

    public static List<Integer> findWordsContaining_IndexOf(String[] words, char x) {
        List<Integer> results = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) >= 0) {
                results.add(i);
            }
        }
        return results;
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (isPointersNotMetAndLetterFound(x, j, words[i]) || isPointersMetAndLetterFound(x, j, words[i])
                ) {
                    result.add(i);
                    break;
                } else if (j > words[i].length() - 1 - j) {
                    break;
                }
            }
        }

        return result;
    }

    private static boolean isPointersMetAndLetterFound(char x, int j, String words) {
        return j == words.length() - 1 - j && words.charAt(j) == x;
    }

    private static boolean isPointersNotMetAndLetterFound(char x, int j, String words) {
        return j < words.length() - 1 - j && (words.charAt(j) == x || words.charAt(words.length() - 1 - j) == x);
    }
}
