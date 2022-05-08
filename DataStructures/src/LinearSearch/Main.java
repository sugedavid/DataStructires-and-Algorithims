package LinearSearch;

public class Main {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8};
		
		int index = linearSearch(array, 10);
		
		if(index != 1) {
			System.out.println("Value found");
		}else {
			System.out.println("Value not found");
		}
	}

	private static int linearSearch(int[] array, int value) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == value) {
				return i;
			}
			
		}
		
		return -1;
		
	}

}
