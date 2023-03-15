package LeetCode;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {2,3,1};
        System.out.println(maxProfit(prices));
    }

//    Time limit exceeded for big array
//    public static int maxProfit(int[] prices) {
//        int maxProfit = Integer.MIN_VALUE;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i; j < prices.length; j++) {
//                int diff = prices[j] - prices[i];
//                if ( maxProfit < diff)
//                    maxProfit = diff;
//            }
//
//        }
//        return maxProfit;
//    }

    public static int maxProfit(int[] prices) {
        int sellValue = 0;
        int holdValue = Integer.MIN_VALUE;

        for (final int price : prices) {
            sellValue = Math.max(sellValue, holdValue + price);
            holdValue = Math.max(holdValue, -price);
        }

        return sellValue;
    }

//    public int maxProfit(int[] prices) {
//        int res = 0, buy = Integer.MAX_VALUE;
//        for (int price : prices) {
//            buy = Math.min(buy, price);
//            res = Math.max(res, price - buy);
//
                // also working
//            res = Math.max(res, price - buy);
//            buy = Math.min(buy, price);
//
//        }
//        return res;
//    }


}
