package n_170_two_sum_III;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */

public class TwoSum {
    Set<Integer> sums;
    List<Integer> nums;

    public TwoSum() {
        sums = new HashSet<>();
        nums = new ArrayList<>();
    }

    public void add(int number) {
        nums.add(number);
        if (nums.size() < 2) return;

        for (int i = 0; i < nums.size()-1; i++) {
            sums.add(nums.get(i) + number);
        }
    }

    public boolean find(int value) {
        return sums.contains(value);
    }
}
