import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minBuy = Math.min(minBuy, price);
            maxProfit = Math.max(maxProfit, price - minBuy);
            System.out.println("minBuy: " + minBuy + ", maxProfit: " + maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock bestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();
        int[] prices = {2, 6, 0, 2};
        System.out.println(bestTimetoBuyandSellStock.maxProfit(prices));
    }
}
