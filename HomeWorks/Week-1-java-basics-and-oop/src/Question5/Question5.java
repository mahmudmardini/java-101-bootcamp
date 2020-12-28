package Question5;

public class Question5 {

	public void isEven(int[] array) {
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i] + " Çift.");
			}else {
				System.out.println(array[i] + " Tek.");
			}
		}
	}
}