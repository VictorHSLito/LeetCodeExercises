class Solution {
    public int maxProfit(int[] prices) {
        int[] newArray = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            newArray[i] = prices[i + 1]  - prices [i];
        }

        int profit = 0;
        for (int j = 0; j < newArray.length; j++) {
            if (newArray[j] >= 0) {
                profit += newArray[j];
            }
        }

        return profit;
    }
}