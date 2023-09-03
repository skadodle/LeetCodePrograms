package LeetCode;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > max)
                    max = prices[j] - prices[i];
            }
        }
        return max;
    }

    public static int maxProfitOptimized(int[] prices) {
        int max = 0;
        int minElem = prices[0]; // 7 1 5 3 6 4

        for (int price : prices) {
            if (price < minElem) {
                minElem = price;
            }
            if (price - minElem > max) {
                max = price - minElem;
            }
        }
        return max;
    }
}
