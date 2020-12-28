package Question1;

import java.util.Arrays;

public class InsertionSort {
	
	int[] array;
	int temp;
	
	InsertionSort (int[] array){
		this.array = new int[array.length];
		for(int i=0; i< array.length; i++) {
			this.array[i] = array[i];
		}
	}
	
	public void sort() {
				for(int i=0; i< array.length; i++) {
					
					for(int j=i; j>=1; j--) {
						
						if(array[j] < array[j-1]) {
							temp = array[j];
							array[j] = array[j-1];
							array[j-1] = temp;
							
						}
					}
					
				}
	}
	
	public void printArray(){
		System.out.println(Arrays.toString(array));
	}
}
