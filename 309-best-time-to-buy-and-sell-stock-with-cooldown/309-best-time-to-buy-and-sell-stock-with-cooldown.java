class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0 || n==1)
            return 0;
        
        int[] buy = new int[n];
        int[] sell = new int[n];
        buy[0] = prices[0];
        buy[1] = Math.min(buy[0],prices[1]-sell[0]);
        sell[1] = Math.max(sell[0],prices[1]-buy[0]);
        for(int i=2;i<n;i++){
            buy[i] = Math.min(buy[i-1],prices[i]-sell[i-2]);
            sell[i] = Math.max(sell[i-1],prices[i]-buy[i-1]);
        }
        return sell[n-1];
    }
}