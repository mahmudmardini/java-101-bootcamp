package Question1;

import java.util.Arrays;


public class main {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,16,17,18,19,6,15,24,25,20,7,14,23,22,21,8,13,12,11,10,9};
		int temp;

		// Arrayi 2 tane algortitma ile siraladim
		// InsertionSort algoritma hizli bir cozumdur ama buyuk ve karisik veriler (worst case) icin cok maliyetlidir (O(n^2)).
		// HeapSort ise daha uygundur (O(n log n)).
		InsertionSort insertionSort = new InsertionSort(array);
		
		// Sort the array with insertion sort algorithm
		insertionSort.sort();
		
		// Print the sorted array
		System.out.print("With Insertion Sort Algorithm: ");
		insertionSort.printArray();
		
		Heap heapSort = new Heap(array);
		
		// Sort the array with Heap Sort algorithm
		heapSort.heapSort();
		
		// Print the sorted array
		System.out.print("With Heap Sort Algorithm: ");
		heapSort.printArray();

	}

}
