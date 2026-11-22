package n_245_shortest_word_distance_III;

//245. Shortest Word Distance III
//https://leetcode.com/problems/shortest-word-distance-iii

class Solution {
    static void main() {
        System.out.println(shortestWordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice"));
        System.out.println(shortestWordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding"));
        System.out.println(shortestWordDistance(new String[]{"A", "B", "C", "D", "E", "A", "F", "G", "A", "C", "C", "A", "A", "D"}, "A", "D"));
        System.out.println(shortestWordDistance(new String[]{"a", "x", "b", "x", "a", "b"}, "a", "b"));
        System.out.println(shortestWordDistance(new String[]{"a", "x", "b", "x", "x", "a", "b"}, "a", "b"));
        System.out.println(shortestWordDistance(new String[]{"a", "x", "b", "x", "x", "a", "b"}, "x", "x"));
    }

    public static int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        String lastWord = null;
        int lastIndex = 0;
        int smallestDistance = Integer.MAX_VALUE;
        boolean same = word1.equals(word2);

        for (int i = 0; i < wordsDict.length; i++) {
            if (!wordsDict[i].equals(word1) && !wordsDict[i].equals(word2)) continue;
            if (lastWord == null) {
                lastWord = wordsDict[i];
                lastIndex = i;
                continue;
            }

            if (lastWord.equals(wordsDict[i])) {
                if (same) {
                    smallestDistance = smallest(i, lastIndex, smallestDistance);
                }
                lastIndex = i;
            } else {
                lastWord = wordsDict[i];
                smallestDistance = smallest(i, lastIndex, smallestDistance);
                lastIndex = i;
            }
        }

        return smallestDistance;
    }

    private static int smallest(int i, int lastIndex, int smallestDistance) {
        if (i - lastIndex <= smallestDistance) {
            return i - lastIndex;
        }
        return smallestDistance;
    }
}
