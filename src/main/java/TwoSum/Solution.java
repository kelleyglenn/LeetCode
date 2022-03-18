package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexToInt = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            indexToInt.put(i, nums[i]);
        }
        Map.Entry<Integer, Integer>[] sorted = indexToInt.entrySet().toArray(new Map.Entry[0]);
        Arrays.sort(sorted, Map.Entry.comparingByValue());
        int low = 0, high = sorted.length - 1;
        int curSum = sorted[low].getValue() + sorted[high].getValue();
        while (curSum != target) {
            if (curSum < target) {
                low++;
            }
            else {
                high--;
            }
            curSum = sorted[low].getValue() + sorted[high].getValue();
        }
        return new int[] { sorted[low].getKey(), sorted[high].getKey() };
    }
}
