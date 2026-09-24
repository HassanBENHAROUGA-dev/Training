import java.util.ArrayList;
import java.util.Collections;

public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i-1]);
            if (prices[i] > prices[i - 1]) {
                if(i+1 <prices.length && prices[i] > prices[i+1]){
                    System.out.println(prices[i]);
                    list.add(prices[i] - minBuy);
                    System.out.println("minBuy: " + minBuy + ", maxProfit: " + (prices[i] - minBuy));
                    minBuy = Integer.MAX_VALUE;

                }else if(i == prices.length - 1 && prices[i] > prices[i-1]){
                    list.add(prices[i] - minBuy);
                    System.out.println("minBuy: " + minBuy + ", maxProfit: " + (prices[i] - minBuy));
                }
            }
        }
        list.sort(Collections.reverseOrder());
        return list.size()>1 ? list.get(0) + list.get(1) : list.size() == 1 ? list.get(0) : 0;
    }

    public static void main(String[] args) {
            BestTimetoBuyandSellStockIII bestTimetoBuyandSellStockIII = new BestTimetoBuyandSellStockIII();
            int[] prices = {1,2,4,2,5,7,2,4,9,0};
            System.out.println(bestTimetoBuyandSellStockIII.maxProfit(prices));

    }
}
