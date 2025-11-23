import java.util.*;

class Solution {
    public int maxSumDivThree(int[] nums) {
        List<Integer> r0 = new ArrayList<>();
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        for (int x : nums) {
            if (x % 3 == 0) r0.add(x);
            else if (x % 3 == 1) r1.add(x);
            else r2.add(x);
        }
        Collections.sort(r1);
        Collections.sort(r2);

        int sum = 0;
        for (int x : nums) sum += x;

        if (sum % 3 == 0) return sum;

        if (sum % 3 == 1) {
            int remove1 = r1.size() >= 1 ? r1.get(0) : Integer.MAX_VALUE;
            int remove2 = r2.size() >= 2 ? r2.get(0) + r2.get(1) : Integer.MAX_VALUE;
            return sum - Math.min(remove1, remove2);
        }
        int remove1 = r2.size() >= 1 ? r2.get(0) : Integer.MAX_VALUE;
        int remove2 = r1.size() >= 2 ? r1.get(0) + r1.get(1) : Integer.MAX_VALUE;
        return sum - Math.min(remove1, remove2);
    }
}
