package Question3;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int N = scan.nextInt();
		int[] array = new int[N];		
		
		for(int i = 0; i<array.length; i++) {
				array[i] = (int)(Math.random() * 11);
		}
		
		FirstSolution f = new FirstSolution(array);
		SecondSolution s = new SecondSolution(array);
		
		System.out.print("Array: ");
		System.out.println(Arrays.toString(array));
		
		//first solution with Set structure (better time complexity)
		System.out.print("First solution: ");
		f.printRecurringNumbers();
		
		//second solution (worse time complexity)
		System.out.print("Second solution: ");
		s.printRecurringNumbers();
		
		
	
	}

}
