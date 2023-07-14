class Solution {
    public int maxProfit(int[] prices) {
        // if(prices.length <= 1) return 0;
        // int profit = 0;
        // int max = 0;
        // int var = prices[0];
        // for(int i=1;i<prices.length;i++) {
        //     if(prices[i] < prices[i-1]) {
        //         var = prices[i];
        //         profit += max;
        //         max = 0;
        //     }
        //     else{
        //         max = Math.max(max,prices[i]-var);
        //     }
        // }
        // profit += max;
        // return profit;

        int profit = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i-1] < prices[i]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}