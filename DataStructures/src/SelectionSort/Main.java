package SelectionSort;

public class Main {
	
	public static void main(String[] args) {
		int[] array = {1,4,8,2,3,6,9};
		
		selectionSort(array);
		
		for(int i : array) {
			System.out.print(i);
		}
	}

	private static void selectionSort(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			
			int min = i;
			
			for(int j = i + 1; j < array.length - 1; j++) {
				
				if(array[min] > array[j]) {
					min = array[j];
				}
			}
			
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
	}

}
