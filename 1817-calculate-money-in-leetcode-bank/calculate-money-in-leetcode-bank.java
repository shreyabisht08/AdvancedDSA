class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int mondayAmount = 1;
        int dayAmount = mondayAmount;

        for (int i = 1; i <= n; i++) {
            total += dayAmount;
            dayAmount++;
            if (i % 7 == 0) {
                mondayAmount++;
                dayAmount = mondayAmount;
            }
        }
        return total;
    }
}

