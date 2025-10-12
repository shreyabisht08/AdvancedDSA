class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
           for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
           }
        HashSet<Integer> resultset = new HashSet<>();
            for(int j=0;j<nums2.length;j++){
                if(set1.contains(nums2[j])){
                    resultset.add(nums2[j]);
                }
            }
            int[] result = new int[resultset.size()];
        int i = 0;
        for (int num : resultset) {
            result[i++] = num;
        }

        return result;
    }
}