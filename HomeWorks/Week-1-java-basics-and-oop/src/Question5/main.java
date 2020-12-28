package Question5;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {

		Question5 q5 = new Question5();
		
		int[] array = new int[100];
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random()*100);
		}

		System.out.println("Array Elemanlari: " + Arrays.toString(array));
		
		q5.isEven(array);
	}

}