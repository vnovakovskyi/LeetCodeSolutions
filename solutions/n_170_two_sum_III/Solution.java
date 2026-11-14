package n_170_two_sum_III;

//170. Two Sum III - Data structure design
//https://leetcode.com/problems/two-sum-iii-data-structure-design

class Solution {

    static void main() {
        TwoSum obj = new TwoSum();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(5);
        obj.add(8);
        obj.add(3);
        obj.add(6);
        System.out.println(obj.find(9));
    }
}
