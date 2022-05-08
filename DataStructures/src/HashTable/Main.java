package HashTable;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>(10);
		
	 	table.put(100, "Spongebob");
    	table.put(123, "Patrick");
    	table.put(321, "Sandy");
    	table.put(555, "Squidward");
    	table.put(777, "Gary");
    	table.put(882, "Suge");
    	
    	//remove
    	table.remove(882);
    	
    	for(Integer key: table.keySet()) {
    		System.out.println( key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
    	}
    	
    	 int[] answer = {};
    	 
    	 answer[0] = 0;
    	 System.out.println(answer);

	}

}
