import java.util.*;

class Solution {
    public int specialTriplets(int[] nums) {
        long MOD = 1_000_000_007L;
        int n = nums.length;

        Map<Integer, Long> right = new HashMap<>();
        Map<Integer, Long> left = new HashMap<>();
        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0L) + 1);
        }
        long ans = 0;
        for (int j = 0; j < n; j++) {
            int mid = nums[j];
            right.put(mid, right.get(mid) - 1);
            long leftCount = left.getOrDefault(2 * mid, 0L);
            long rightCount = right.getOrDefault(2 * mid, 0L);
            ans = (ans + (leftCount * rightCount) % MOD) % MOD;
            left.put(mid, left.getOrDefault(mid, 0L) + 1);
        }
        return (int) ans;
    }
}
