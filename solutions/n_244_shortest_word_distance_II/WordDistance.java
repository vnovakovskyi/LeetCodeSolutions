package n_244_shortest_word_distance_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDistance {
    private final String[] wordsDict;
    private Map<String, List<Integer>> indexes;

    public WordDistance(String[] wordsDict) {
        this.wordsDict = wordsDict;
        this.indexes = new HashMap<>();
        buildIndexes();
    }

    public int shortest(String word1, String word2) {
        List<Integer> left = indexes.get(word1);
        List<Integer> right = indexes.get(word2);

        int smallestDistance = Integer.MAX_VALUE;
        int i = 0;
        int k = 0;

        while (i < left.size() && k < right.size()) {
            int x = left.get(i);
            int y = right.get(k);
            smallestDistance = Math.min(smallestDistance, Math.abs(x - y));

            if (x < y) {
                i++;
            } else {
                k++;
            }
        }

        return smallestDistance;
    }

    private void buildIndexes() {
        for (int i = 0; i < wordsDict.length; i++) {
            if (indexes.containsKey(wordsDict[i])) {
                indexes.get(wordsDict[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                indexes.put(wordsDict[i], list);
            }
        }
    }
}
