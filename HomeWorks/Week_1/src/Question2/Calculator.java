package Question2;

import java.util.*;

public class Calculator {
	Scanner scan = new Scanner(System.in);
	private double num1, num2;
	private double result;
	
	public void calculate(){
		 int selection;
		System.out.println("------------");
		System.out.println("1. Toplama ");
		System.out.println("2. Cikarma ");
		System.out.println("3. Carpma ");
		System.out.println("4. Bolme ");
		System.out.println("------------");

		System.out.print("Yapmak istediginiz islemi seciniz: ");
		
		try {
			
		selection = scan.nextInt();
		
		if(selection < 1 || selection > 4) throw new Exception("Yanlis giris");
		
		
		System.out.print("1. Sayiyi giriniz: ");
		num1 = scan.nextDouble();
		
		System.out.print("2. Sayiyi giriniz: ");
		num2 = scan.nextDouble();
		
		}catch(InputMismatchException e) {
			System.out.println(e);
			return;
			
		}catch(Exception e2) {
			System.out.println(e2);
			calculate();
			return;
		}
		
		if(selection == 1) {
			result = add(num1, num2);
		}else if(selection == 2) {
			result = sub(num1, num2);			
		}else if(selection == 3) {
			result = multi(num1, num2);
		}else if(selection == 4) {
			result = divide(num1, num2);
		}
		
		System.out.println("Sonuc: " + result);
		System.out.println("Devam etmek ister misinz? Y/N");
		String con = scan.next();
		if(con.equalsIgnoreCase("Y")) calculate();
	}
	
	
	private double add(double number1, double number2) {
		
		return number1 + number2;
	}
	
	private double sub(double number1, double number2) {
		
		return number1 - number2;
	}

	private double multi(double number1, double number2) {
	
		return number1 * number2;
}
	
	private double divide(double number1, double number2) {
		
		return number1 / number2;
	}
	
	
}
