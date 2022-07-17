class Solution {
    public int maxProfit(int[] prices) {
        int profit=0; // assume first day is selling and buying day
        if(prices.length==1)
            return 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit += (prices[i] - prices[i - 1]); // selling day is the highest
            }
        }
        return profit;
    }
}