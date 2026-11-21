package n_244_shortest_word_distance_II;

//244. Shortest Word Distance II
//https://leetcode.com/problems/shortest-word-distance-ii

class Solution {
    static void main() {
        WordDistance wordDistance = new WordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"});
//        System.out.println(wordDistance.shortest("coding", "practice"));

//        wordDistance = new WordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"});
//        System.out.println(wordDistance.shortest("makes", "coding"));

//        wordDistance = new WordDistance(new String[]{"A", "B", "C", "D", "E", "A", "F", "G", "A", "C", "C", "A", "A", "D"});
//        System.out.println(wordDistance.shortest("A", "D"));

        wordDistance = new WordDistance(new String[]{"a","x","b","x","a","b"});
        System.out.println(wordDistance.shortest("a", "b"));

        wordDistance = new WordDistance(new String[]{"a","x","b","x","x","a","b"});
        System.out.println(wordDistance.shortest("a", "b"));
    }
}
