class Solution {
    public int maxProfit(int[] prices, int fee) {
        int obp = -prices[0];
        int osp = 0;
        for(int i=1;i<prices.length;i++){
            int nbp = 0;
            int nsp = 0;
            if(osp-prices[i]>obp){
                nbp = osp-prices[i];
            }
            else
                nbp = obp;
            if(prices[i]+obp-fee>osp){
                nsp = prices[i]+obp-fee;
            }
            else
                nsp = osp;
            obp = nbp;
            osp = nsp;
        }
        return osp;
    }
}