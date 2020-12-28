package Question1;

import java.util.Arrays;

public class Heap {
	int array[];
	int heapSize;
	
	public  Heap(int[] arry) {
		array = arry;
		heapSize =0;
	}
	
	public int left(int i) {
		return 2 * i +1;
	}
	public int right(int i) {
		return 2 * i +2;
	}
	
	public int parent(int i) {
		return  (i-1) / 2;
	}
	
	public void buildMaxHeap() {
		heapSize = array.length;
		for(int i = array.length / 2; i>=0;i-=1) {
			maxHeapify(i);
		}
	}
	
	public void maxHeapify(int i) {
		int largest;
		int left = left(i);
		int right = right(i);
		
		if(left<=heapSize-1 && array[left] > array[i])
			largest = left;
		else
			largest = i;
		
		if(right<=heapSize-1 && array[right] > array[largest])
			largest = right;
		
		if(largest != i) {
			int temp ;
			temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;
			maxHeapify(largest);
		}
	}
	
	public void heapSort() {
		int temp;
		buildMaxHeap();
		
		for(int i = array.length-1; i>=1;i--) {
			temp = array[0];
			array[0]= array[i];
			array[i] = temp;
			heapSize--;
			maxHeapify(0);
		}
	}
	
	public void printArray(){
		System.out.println(Arrays.toString(array));
	}
}
