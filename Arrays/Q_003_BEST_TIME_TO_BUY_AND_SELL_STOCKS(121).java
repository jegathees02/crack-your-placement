class Solution {
    public int maxProfit(int[] prices) {
        // int profit = 0;
        // int min = Integer.MAX_VALUE;
        // // int profit = 0;
        // int tot_profit = 0;
        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]<min) {
        //         min = prices[i];
        //     }
        //     profit = prices[i] - min;
        //     if(profit>tot_profit) {
        //         tot_profit = profit;
        //     }
        // }
        // return tot_profit;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i : prices) {
            min = Math.min(min,i);
            profit = Math.max(profit,i-min);
        }
        return profit;
        
    }
}