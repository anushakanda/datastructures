Given an array of stock prices, give buying point and selling point for accruing maximum profit in one transaction.
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

Scenarios:
1. All prices same -> -1,-1
2. Prices in descending order -> -1,-1
3. Prices in ascending order -> prices[0], prices[prices.length-1]
4. Prices is empty or null  or only 1 element -> IllegalArgumentException
5. Prices can’t be negative.

Approaches:
1. Check all possible buy and sell combinations while tracking maxProfit one.T:0(N^2)

   public class StockProfitNaive {

    public static int[] findBuySell(int[] prices) {
        if (prices == null || prices.length < 2) {
            return new int[] {-1, -1}; // No valid transaction possible
        }

        int buyPoint = -1;
        int sellPoint = -1;
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) { // Iterate until the second-last element
            for (int j = i + 1; j < prices.length; j++) { // Check all subsequent days for selling
                int potentialProfit = prices[j] - prices[i]; // Calculate potential profit
                if (potentialProfit > maxProfit) {
                    maxProfit = potentialProfit;
                    buyPoint = i;
                    sellPoint = j;
                }
            }
        }

        return new int[]{buyPoint, sellPoint};
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] buySell = findBuySell(prices);

        if (buySell[0] != -1 && buySell[1] != -1) {
            System.out.println("Buy on day " + (buySell[0] + 1) + " (price: $" + prices[buySell[0]] + ")");
            System.out.println("Sell on day " + (buySell[1] + 1) + " (price: $" + prices[buySell[1]] + ")");
            System.out.println("Maximum profit: $" + maxProfit);
        } else {
            System.out.println("No profitable transaction possible.");
        }
    }
}

2. At every step, keep track of the minimum buy price of stock encountered so far. 
   If the current price of stock is lower than the previous buy price, then we will update the buy price, else if the current price of stock is greater than the previous buy price then we can sell at this price to get some profit. 
   After iterating over the entire array, return the maximum profit.
   T: 0(N)

   public int maxProfit(int[] prices) {
       int buyPoint = 0;
       int sellPoint = -1;
       int maxProfit = 0;
       for( int index =1; index < prices.length;index++){
           int sellPrice = prices[index];
           int buyPrice = prices[buyPoint];
           // Checking for lower buy value
           if(sellPrice<buyPrice){
              buyPoint = index;
           }
           // Checking for higher profit
           else if(sellPrice >= buyPrice ){
               if(sellPrice-buyPrice > maxProfit){
                 maxProfit = sellPrice-buyPrice;
                 sellPoint = index;
               }
           }
       }
       return maxProfit;
   }



