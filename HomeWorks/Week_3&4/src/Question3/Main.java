package Question3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Map<Long, List<Student>> studentMap = new HashMap<Long, List<Student>>();

		try {
			System.out.println("Öğrenci Numarası, Adı, Soyadı, yaşı ve bölümü sırasıyla giriniz.");
			long studentId = scan.nextLong();
			studentMap.put(studentId, Arrays.asList(new Student(studentId, scan.next(), scan.next(), scan.nextInt(), scan.next()) ));
		
			System.out.println(studentMap);
		}catch(Exception e) {
			System.out.println("Bilgilerinizi kontrol ediniz.");
		}
		
	}

}
