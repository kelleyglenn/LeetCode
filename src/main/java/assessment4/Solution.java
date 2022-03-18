package assessment4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> uniques = Arrays.stream(nums).boxed().collect(Collectors.toUnmodifiableSet());
        return IntStream.range(1, nums.length + 1).boxed().filter(i -> !uniques.contains(i)).toList();
    }
}
