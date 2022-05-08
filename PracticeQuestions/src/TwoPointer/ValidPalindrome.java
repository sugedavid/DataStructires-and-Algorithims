package TwoPointer;

public class ValidPalindrome {
	
   public boolean isPalindrome(String s) {
        
        String clean = s.replaceAll("\\P{Alnum}", "").toLowerCase();
        
        for(int i=0; i< clean.length() ; i++){
            
            if(clean.charAt(i) != clean.charAt(clean.length() - i - 1)) return false;
            
        }
                                    
        return true;
    }

}
