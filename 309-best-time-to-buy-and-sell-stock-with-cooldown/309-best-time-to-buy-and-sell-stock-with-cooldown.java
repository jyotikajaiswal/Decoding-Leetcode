class Solution {
    public int maxProfit(int[] prices) {
        int obp = -prices[0];
        int osp =0;
        int oc = 0;
        for (int i = 1; i < prices.length;i++){
            int nbp = 0;
            int nsp = 0;
            int nc = 0;
            if(oc-prices[i]>obp){
                nbp = oc-prices[i];
            }
            else
                nbp = obp;
            if(prices[i]+obp>osp){
                nsp = prices[i]+obp;
            }
            else
                nsp = osp;
            if(osp>oc){
                nc= osp;
            }
            else{
                nc = oc;
            }
            obp = nbp;
            osp = nsp;
            oc = nc;
      }
      return osp;
    }
}