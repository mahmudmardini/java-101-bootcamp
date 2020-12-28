package Question3;

public class SecondSolution {

	int[] newArray;
	int[] inputArray;
	int N;
	
	SecondSolution(int[] array){
		
		this.N = array.length;
		inputArray = array;
		newArray = new int[N];
		
		for(int i = 0; i<N; i++)
			newArray[i] = -1;
		
		setRecurringNumbers();
		}
	
	
	public int[] setRecurringNumbers() {
		
		for(int i = 0; i<inputArray.length; i++) {
			if(getRecurringCount(inputArray)[i]>1) newArray[i] = inputArray[i];
		}
		
		for(int i = 0; i<inputArray.length; i++) {
			for(int j = 0; j<inputArray.length; j++) {
				
			if(newArray[i] == newArray[j]) {
				for(int k = j+1; k<inputArray.length; k++) {
					if(newArray[i] == newArray[k]) newArray[j] = -1;
				}
			}
			
			}
		}
		
		return newArray;
	}
	
	public void printRecurringNumbers(){
		System.out.print("Tekrarlanan sayilar: ");
		
		for(int i = 0; i<N; i++) {
			if(newArray[i] != -1)
				System.out.print(newArray[i] + " ");
		}
	}
	
	
	public int[] getRecurringCount(int[] array) {
		int[] count = new int[array.length];
		
		for(int i = 0; i<array.length; i++) {
			
			for(int j = i; j>=0; j--)
				if(array[i]==array[j]) count[i]++;
				
		}
		
		return count;
	}
	
}
