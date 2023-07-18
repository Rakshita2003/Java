// T.C is O(n)

public class BuyAndSellStocks {
    public static int BuyAndSellStocks(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE; // + infinity

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // todays profit
                maxProfit = Math.max(maxProfit, profit); // overall profit
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuyAndSellStocks(prices));
    }
}
