// My Solve Passed 142 Test Cases
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class problem_two {

    static public int maxProfit(int[] prices) {

        List<Integer> pricesList = Arrays.stream(prices).boxed().collect(Collectors.toList());
        List<Integer> profitList = new ArrayList<>();
        Integer minValue = Collections.min(pricesList); // 1
        int minIndex = 0; // Assume 

        for (int i = 0; i < prices.length; i++) {

            if (minValue == prices[i]) {
                minIndex = i;
            }

        }

        if(minIndex==prices.length-1){
            return 0;
        }

        // After this loop minIndex=4
        else {
            
                for (int i = 0; i < prices.length; i++) {
                    if (i > minIndex) {
                        int Profit = prices[i] - minValue;
                        profitList.add(Profit);
                    }

                }
            

            Integer maXProfit = Collections.max(profitList);

            if (maXProfit > 0) {
                return maXProfit;
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println(maxProfit(prices));
        maxProfit(prices);
    }
}
