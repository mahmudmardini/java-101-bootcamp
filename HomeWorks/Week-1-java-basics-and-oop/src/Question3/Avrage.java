package Question3;

public class Avrage {
	
	private double sum, avrage;
	private int count;
	private int[][] array ;
	
	Avrage(int[][] array){
		this.array = array;
		this.count = (array.length * array[0].length);
		
		getSum();
	}
	
	public double getAvrage() {
		
		avrage = sum / count;
		
		return avrage;
		
	}
	
	public int getCount() {
		return count;
	}
	
	public double getSum() {
		
		this.sum = 0;
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				sum = sum + array[i][j];
			}
		}
		return sum;
	}
}
