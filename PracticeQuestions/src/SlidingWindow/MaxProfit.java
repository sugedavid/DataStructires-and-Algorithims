package SlidingWindow;

public class MaxProfit {

	 public int maxProfit(int[] prices) {
	        // TC : O(n)
	        // SC : O(1)
	        
	        int maxProfit = 0;
	        int smallestPrice = -1;

	        // loop through each prices

	        for(int i = 0; i < prices.length - 1 ; i++){
	            
	            // calculate currentProfit = (nextElement - smallestPrice) 
	            // & update maxProfit with the largest profit
	            int currentElement = prices[i];
	            int nextElement = prices[i + 1];
	           
	             // check smallest no
	            if(smallestPrice == -1){
	                 smallestPrice = currentElement;
	            }
	            if(smallestPrice > currentElement){
	                smallestPrice = currentElement;
	            }
	            
	            int currentProfit = nextElement - smallestPrice;
	            
	            // check largest no
	            if(currentProfit > 0 && maxProfit < currentProfit){
	                  maxProfit = currentProfit;
	            }
	            
	        }
	        
	        return maxProfit;
	    }
}
