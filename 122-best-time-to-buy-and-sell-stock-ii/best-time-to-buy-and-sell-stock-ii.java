class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 0;
        boolean inStock = false;
        for(int i = 0; i<prices.length-1; i++){
            if(prices[i]<prices[i+1] && !inStock){
                buy = prices[i];
                inStock = true;
                continue;
            }
            if(prices[i]>prices[i+1] && inStock){
                int thisStockProfit = prices[i] - buy;
                profit += thisStockProfit;
                inStock = false;
            }
        }
        if(inStock){
            profit += prices[prices.length-1] - buy;
        }
        return profit;
    }
}