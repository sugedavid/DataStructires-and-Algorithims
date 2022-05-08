package BinarySearch;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		int[] array = new int[100];
		int target = 5;
		
		for(int i = 0; i < array.length ; i++) {
			array[i] = i;
		}
		
		
		// provided by java
		int value = Arrays.binarySearch(array, target);
		int value2 = binarySearch(array, target);
		
		if(value != -1) {
			System.out.println("Value found at index: " + value2);
		}
		else {
			System.out.println("Value not found: " + value2);
		}
	}

	private static int binarySearch(int[] array, int target) {
		
		// target = 60
		int low = 0;
		int high = array.length - 1; // 99
		
		while(low <= high) {
			int middle = low + (high - low) / 2; // 0 + (99 - 0) / 2 = 49.5 = 49 
			int valueAtMiddle = array[middle]; // 50
			
			System.out.println("Middle value: " + valueAtMiddle);
			
			if(valueAtMiddle < target) low = middle + 1; // 50 < 60
			else if (valueAtMiddle > target) high = middle -1; // 50 > 20
			else return middle;
		}
		
		return -1;
		
	}

}


