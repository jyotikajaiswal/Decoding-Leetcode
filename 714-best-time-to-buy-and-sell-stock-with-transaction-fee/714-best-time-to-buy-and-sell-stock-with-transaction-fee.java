class Solution {
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length, profit = 0, buy = prices[0];
        for (int i = 1; i < len; i++) {
            profit = Math.max(profit,  prices[i]- buy - fee);
            buy = Math.min(buy, prices[i]-profit);
        }
        return profit;
            // int nbp = 0;
            // int nsp = 0;
            // if(osp-prices[i]>obp){
            //     nbp = osp-prices[i];
            // }
            // else
            //     nbp = obp;
            // if(prices[i]+obp-fee>osp){
            //     nsp = prices[i]+obp-fee;
            // }
            // else
            //     nsp = osp;
            // obp = nbp;
            // osp = nsp;  
    }
}