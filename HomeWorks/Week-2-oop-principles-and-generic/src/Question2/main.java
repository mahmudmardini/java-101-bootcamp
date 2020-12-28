package Question2;

import java.util.Arrays;

public class main {
public static void main(String[] args){
	
	int N = 3,M = 3,T = 3;
	
	int[][] matrix1 = new int[N][M];
	int[][] matrix2 = new int[M][T];
	
	for(int i = 0; i<matrix1.length; i++) {
		for(int j = 0; j<matrix1[0].length; j++) {
			matrix1[i][j] = (int)(Math.random() * 11);
		}
	}
	
	for(int i = 0; i<matrix2.length; i++) {
		for(int j = 0; j<matrix2[0].length; j++) {
			matrix2[i][j] = (int)(Math.random() * 11);
		}
	}
	
	System.out.println("Matrix 1: \n" + Arrays.deepToString(matrix1));
	System.out.println("Matrix 2: \n" + Arrays.deepToString(matrix2));
	
	MultiplyMatrix<Integer> m = new <Integer>MultiplyMatrix();
	m.setMatrices(matrix1, matrix2);
	System.out.println(Arrays.deepToString(m.multiply())); 
	

}
	
}
