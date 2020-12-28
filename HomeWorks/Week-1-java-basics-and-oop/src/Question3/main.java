package Question3;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {

		int[][] array = new int[10][10];
		
		// Array elemanlari rastgele olarak set etme 
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				array[i][j] = (int)(Math.random()*100);
			}
		}
		
		Avrage avrage = new Avrage(array);
		
		System.out.println("Array Elemanlari: " + Arrays.deepToString(array));
		
		System.out.println("Eleman sayisi: " + array.length + "x" + array[0].length + " = "+ avrage.getCount());
		
		System.out.println("Elemanlarin toplami = " + avrage.getSum());
		
		System.out.println("Elemanlarin Ortalama = " + avrage.getAvrage());
	}

}
