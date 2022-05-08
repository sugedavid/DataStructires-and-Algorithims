package BurbleSort;

public class Main {
	
	public static void main(String[] args) {
		
		int[] array = {1,4,8,2,3,6,9};
		
		bubbleSort(array);
		
		for(int i : array) {
			System.out.print(i);
		}
	}

	private static void bubbleSort(int[] array) {
		
		for(int i = 0; i< array.length -1 ; i++) {
			
			for(int j = 0; j < array.length - i - 1; j++) {
				
				if(array[j] > array[j + 1]) {
					var temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
	}

}
