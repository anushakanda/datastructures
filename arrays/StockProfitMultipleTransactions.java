/**You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
* On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
* Find and return the maximum profit you can achieve.
**/

https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/1216399636/?envType=study-plan-v2&envId=top-interview-150

public class StockProfitMultipleTransactions {

    public static void printBuySell(int[] prices) {
        if (prices == null || prices.length < 2) {
            System.out.println("No valid transactions possible.");
            return;
        }

        int maxProfit = 0;
        boolean isProfitTransactionFound = false;
        for (int i = 1; i < prices.length; i++) {
            int potentialProfit = prices[i] - prices[i - 1];
            if (potentialProfit > 0) {
                isProfitTransactionFound = true;
                maxProfit += potentialProfit;
                System.out.println("Buy on Day " + (i - 1) + " ($" + prices[i - 1] + ")");
                System.out.println("Sell on Day " + i + " ($" + prices[i] + ")");
            }
        }

        // Check if no transactions were found
        if (!isProfitTransactionFound) {
            System.out.println("No profitable transactions found.");
        } else {
            System.out.println("Maximum profit: $" + maxProfit);
        }
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        printBuySell(prices);
    }
}
