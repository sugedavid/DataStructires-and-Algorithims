package Arrays;
import java.util.*;

public class TwoSumMain {
	
	
	 public int[] twoSum(int[] nums, int target) {
	        
	        Map<Integer, Integer> hashMap = new HashMap<>();
	        
	        for(int i = 0; i < nums.length; i++){
	            
	            //compliment
	            int compliment = target - nums[i];
	            
	            // check if the compliment is in the array
	            if(hashMap.containsKey(compliment)){
	                
	                return new int[] {hashMap.get(compliment), i};
	            }else {
	                
	                hashMap.put(nums[i], i);
	            }
	        }
	        
	        return new int[]{};
	    }   
}
