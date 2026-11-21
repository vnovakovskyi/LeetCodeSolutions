package n_243_shortest_word_distance;

//243. Shortest Word Distance
//https://leetcode.com/problems/shortest-word-distance

class Solution {
    static void main() {
        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice"));
        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding"));
        System.out.println(shortestDistance(new String[]{"A", "B", "C", "D", "E", "A", "F", "G", "A", "C", "C", "A", "A", "D"}, "A", "D"));
        System.out.println(shortestDistance(new String[]{"a","x","b","x","a","b"}, "a", "b"));
        System.out.println(shortestDistance(new String[]{"a","x","b","x","x","a","b"}, "a", "b"));
    }

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        String lastWord = null;
        int lastIndex = 0;
        int smallestDistance = Integer.MAX_VALUE;

        for (int i = 0; i < wordsDict.length; i++) {
            if (!wordsDict[i].equals(word1) && !wordsDict[i].equals(word2)) continue;
            if (lastWord == null) {
                lastWord = wordsDict[i];
                lastIndex = i;
                continue;
            }

            if (lastWord.equals(wordsDict[i])) {
                lastIndex = i;
            } else {
                lastWord = wordsDict[i];
                if (i - lastIndex <= smallestDistance) {
                    smallestDistance = i - lastIndex;
                }
                lastIndex = i;
            }
        }

        return smallestDistance;
    }
}
