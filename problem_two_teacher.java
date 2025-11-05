// This is also solved my me.
public class problem_two_teacher {

    static public int maxProfit(int[] prices) { // 7,6,4,3,1

        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] - minPrice > profit) {
                profit = prices[i] - minPrice;
            } else if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
        }
        return profit;

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
