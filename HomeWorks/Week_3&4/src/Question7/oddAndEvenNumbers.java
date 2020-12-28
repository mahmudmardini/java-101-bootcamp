package Question7;

import java.util.ArrayList;
import java.util.List;

public class oddAndEvenNumbers {

	ArrayList<Integer> mainList = new ArrayList();
	public static ArrayList<Integer> list1 = new ArrayList();
	public static ArrayList<Integer> list2 = new ArrayList();
	public static ArrayList<Integer> list3 = new ArrayList();
	public static ArrayList<Integer> list4 = new ArrayList();
	
	public static List<Integer> evenNumbersList = new ArrayList();
	public static List<Integer> oddNumbersList = new ArrayList();
	oddAndEvenNumbers(){
		for(int i = 1; i<=10000; i++) {
			mainList.add(i);
		}
		int mainListSize = mainList.size();
			for(int i = 1; i <= mainListSize; i++) {
				if(i<=mainListSize/4*1) list1.add(i);
				else if(i<=mainListSize/4*2) list2.add(i);
				else if(i<=mainListSize/4*3) list3.add(i);
				else if(i<=mainListSize) list4.add(i);
			}
	}
}
