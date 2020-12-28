package Question1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		Question1 q1 = new Question1();
		
		System.out.println("Sifrenizi Giriniz: ");
		q1.checkPassword(scan.next());
	}

}
