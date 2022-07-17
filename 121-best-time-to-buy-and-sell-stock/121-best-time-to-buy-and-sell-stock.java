class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1)
        return 0;
        int least = Integer.MAX_VALUE;
        int max = 0;
        int price = 0;
            for(int i=0;i<prices.length;i++){
                if(prices[i]<least){
                    least = prices[i];
                }
                price = prices[i] - least;
                if(price>max)
                    max = price;
            }
        return max;
//     int min=prices[0]; // min so far
//     int result=0;
 
//     for(int i=1; i<prices.length; i++){
//         result = Math.max(result, prices[i]-min);
//         min = Math.min(min, prices[i]);
//     }
 
//     return result;
    }
}