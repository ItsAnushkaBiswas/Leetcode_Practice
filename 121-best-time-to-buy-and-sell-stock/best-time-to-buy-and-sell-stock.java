class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxiprofit=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else if(prices[i]-minprice > maxiprofit){
                maxiprofit = prices[i]-minprice;
            }
        } 
        return maxiprofit;    
    }
}