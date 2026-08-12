//leetcode 121
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int sell = buy;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buy){
                buy = prices[i];
            }
            sell = prices[i];
            if(profit < sell - buy) profit = sell - buy;
        }
        return profit;
    }
}

public class BuyAndSellStocks {
    public static void main(String[] args) {
        
    }
}
