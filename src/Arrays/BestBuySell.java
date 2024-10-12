package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

Problem statement
You are given an array/list 'prices' where the elements of the array represent the prices of the stock as they were yesterday and indices of the array represent minutes. Your task is to find and return the maximum profit you can make by buying and selling the stock. You can buy and sell the stock only once.

Note:

You can’t sell without buying first.
For Example:
For the given array [ 2, 100, 150, 120],
The maximum profit can be achieved by buying the stock at minute 0 when its price is Rs. 2 and selling it at minute 2 when its price is Rs. 150.
So, the output will be 148.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
2 <= N <= 10^4
1 <= ARR[i] <= 10^9

Time Limit: 1 sec.
Sample Input 1:
2
4
1 2 3 4
4
2 2 2 2
Sample Output 1:
3
0
Explanation For Sample Output 1:
For the first test case, it’s optimal to buy the stock at minute 0 and sell it at minute 3 to get a maximum profit of 3.

For the second test case, the maximum profit will be 0 for all possible ways of buying and selling stock.
Sample Input 2:
2
6
17 20 11 9 12 6
4
98 101 66 72
Sample Output 2:
3
6

*/
public class BestBuySell {

	// Method to calculate the maximum profit from the stock prices
    public static int maximumProfit(ArrayList<Integer> prices) {
        // Initialize 'min' with the first price in the list, representing the minimum price so far
        int min = prices.get(0);

        // Initialize 'maxProfit' to 0, as initially no transactions are made, so the profit is 0
        int maxProfit = 0;

        // Loop through the price list starting from the second price (index 1) to the second last price
        // This is done because we can't sell on the first day and we are excluding the last day for a reason.
        for (int i = 1; i < prices.size() - 1; i++) {
            // Calculate the profit if we were to sell on day 'i'
            int currProfit = prices.get(i) - min;

            // Update 'maxProfit' to the maximum of the current profit or the previously calculated maxProfit
            maxProfit = Math.max(maxProfit, currProfit);

            // Update 'min' to the lower value between the current price or the existing minimum price
            // This ensures we are always buying at the lowest price seen so far
            min = Math.min(prices.get(i), min);
        }

        // Return the maximum profit that can be achieved
        return maxProfit;
    }
	
    
    
    
	public static void main(String[] args) {
		int[] Arr  ={7,1,5,3,6,4};
		ArrayList<Integer> arrayList = Arrays.stream(Arr)   // Creates an IntStream
                .boxed()       // Boxes each int to Integer
                .collect(Collectors.toCollection(ArrayList::new));
		  System.out.println("The maximum profit by selling the stock is "+
		  maximumProfit(arrayList));

	}

}
