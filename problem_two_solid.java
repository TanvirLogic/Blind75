public class problem_two_solid {

    /**
     * Calculates the maximum profit by buying and selling stock once 
     * using the efficient O(n) single-pass algorithm.
     * * @param prices The array of stock prices, where prices[i] is the price on day i.
     * @return The maximum profit that can be achieved. Returns 0 if no profit is possible.
     */
    static public int maxProfit(int[] prices) {
        // We need at least two days to buy and sell.
        if (prices == null || prices.length < 2) {
            return 0;
        }

        // Initialize the minimum price seen so far to the first day's price.
        int minPrice = prices[0];
        
        // Initialize the maximum profit to 0, since profit cannot be negative.
        int maxProfit = 0;

        // Start checking from the second day.
        for (int i = 1; i < prices.length; i++) {
            
            // Update the minimum price (potential best buy day)
            // minPrice is the lowest price encountered from day 0 up to day i-1.
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            
            // Calculate the potential profit if we sell on the current day (prices[i])
            // with the best possible buy price (minPrice) seen so far.
            int currentProfit = prices[i] - minPrice;

            // Update the overall max profit found.
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
            // maxProfit = Math.max(maxProfit, prices[i] - minPrice); // A more compact line
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 6, 4, 3, 1};
        // Output: 0 (Correct, prices only drop)
        System.out.println("Max Profit for {7, 6, 4, 3, 1}: " + maxProfit(prices1)); 
        
        int[] prices2 = {7, 1, 5, 3, 6, 4};
        // Output: 5 (Correct, Buy at 1, Sell at 6)
        System.out.println("Max Profit for {7, 1, 5, 3, 6, 4}: " + maxProfit(prices2)); 

        int[] prices3 = {2, 4, 1};
        // Output: 2 (Correct, Buy at 2, Sell at 4)
        System.out.println("Max Profit for {2, 4, 1}: " + maxProfit(prices3));
    }
}