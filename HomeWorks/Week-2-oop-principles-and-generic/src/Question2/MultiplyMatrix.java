package Question2;

public class MultiplyMatrix <M>{

	int N = 3,M = 3,T = 3;
	
	private int[][] result = new int[T][N];
	private	int[][] matrix1;
	private int[][] matrix2;
	
	MultiplyMatrix(){
		
	}
	
	
	public int[][] multiply() {
		
		
		for(int i = 0; i<matrix1.length; i++) {
			for(int j = 0; j<matrix2[0].length; j++) {
				for(int k = 0; k<matrix2[0].length; k++) {

					result[j][k] = result[j][k] + matrix1[i][j] * matrix2[j][k];
				}
			}
		}
		
		return result;
	}
	
	public void setMatrices(int[][] matrix1, int[][] matrix2){
		this.matrix1 = (int[][]) matrix1;
		this.matrix2 = (int[][]) matrix2;
	}
}
