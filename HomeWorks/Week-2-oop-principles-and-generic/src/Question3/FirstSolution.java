package Question3;

import java.util.HashSet;
import java.util.Set;

public class FirstSolution {
	
	int N;
	int[] array;
	int[] count;
	Set<Integer> set ;
	
	FirstSolution(int[] array){
		
		this.N = array.length;
		this.array = array;
		count = new int[N];
		set = new HashSet();
	}
	
	public Set getRecurringNumbers() {
		
		setCount(array);
		
		for(int i = 0; i<N; i++) {
			
			for(int j = i; j>=0; j--) {

				if(count[i] > 1 ) {
					set.add(array[i]);
				}
			}
		}
		
		return set;
	}
	
	public void setCount(int[] array) {
		for(int i = 0; i<N; i++) {
			for(int j = i; j>=0; j--) {

				if(array[i]==array[j]) count[i]++;
			}
		}
	}
	
	public void printRecurringNumbers() {
		System.out.println(getRecurringNumbers());
	}
	
}
