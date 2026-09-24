import java.util.Map;

public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        /*for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;*/
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;
        int fullProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
            int nextValue = 0;
            if(i<prices.length-1){
                nextValue = prices[i+1];
            }
            if(maxProfit >= 1 && nextValue <= prices[i]){
                fullProfit += maxProfit;
                minBuy = Integer.MAX_VALUE;
                maxProfit = 0;
                System.out.println("minBuy: " + minBuy + ", maxProfit: " + maxProfit);
            }


        }
        return fullProfit;
    }

     public static void main(String[] args) {
         BestTimetoBuyandSellStockII bestTimetoBuyandSellStockII = new BestTimetoBuyandSellStockII();
         int[] prices = {7,1,5,3,6,4};
         System.out.println(bestTimetoBuyandSellStockII.maxProfit(prices));
     }
}
