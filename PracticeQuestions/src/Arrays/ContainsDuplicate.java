package Arrays;
import java.util.*;

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
        // TC: 0(n)
        // SC: 0(n)
            
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        // loop through each item in the array & add it to the map
        
        for(int i = 0; i < nums.length ; i++){
            
            // check if the value is found in the array
            if(hashMap.containsKey(nums[i])){
                return true;
            }else{
                hashMap.put(nums[i], i);
            }
        }
        
        return false;
            
    }

}
