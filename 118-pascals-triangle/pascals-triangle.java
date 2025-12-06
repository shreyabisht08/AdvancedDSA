class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            // Add 1 at start
            row.add(1);

            // Fill middle values using previous row
            for (int j = 1; j < i; j++) {
                int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(val);
            }

            // Add 1 at end for rows > 0
            if (i > 0) row.add(1);

            result.add(row);
        }

        return result;
    }
}
