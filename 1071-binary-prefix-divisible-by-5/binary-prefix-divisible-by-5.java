class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int num = 0;

        for (int b : nums) {
            num = ((num << 1) + b) % 5;  // multiply by 2 and add the new bit
            result.add(num == 0);
        }
        return result;
    }
}
