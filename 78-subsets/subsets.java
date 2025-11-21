import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> totalans = new ArrayList<>();
        result(0, nums, new ArrayList<>(), totalans);
        return totalans;
    }

    private void result(int index, int[] nums, List<Integer> ans, List<List<Integer>> totalans) {
        if (index == nums.length) {
            totalans.add(new ArrayList<>(ans));
            return;
        }
        result(index + 1, nums, ans, totalans);

        ans.add(nums[index]);
        result(index + 1, nums, ans, totalans);

        ans.remove(ans.size() - 1);
    }
}
