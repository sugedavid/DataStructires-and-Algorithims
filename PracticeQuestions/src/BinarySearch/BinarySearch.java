package BinarySearch;

public class BinarySearch {
	
	   public int search(int[] nums, int target) {
	        
	        // TC: O(log(n))
	        // SC: 0(1)
	        int low = 0;
	        int high = nums.length - 1;
	        
	        while(low <= high){
	            
	            int middle = low + (high - low) / 2;
	            int valueMiddle = nums[middle];
	            
	            if(valueMiddle < target) low = middle + 1;
	            else if (valueMiddle > target) high = middle -1;
	            else return middle;
	            
	        }
	        
	        return -1;
	    }

}
