package Question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Question3.Student;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      File file = new File("src\\Question6\\Students.txt");
	      
		try {
		      if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		List<Student> studentList = new LinkedList<Student>();

		try {
			System.out.println("Öğrenci sayısı giriniz");
			int studentCount =scan.nextInt();
			for(int i = 0; i<studentCount; i++) {
			System.out.println("Öğrenci Numarası giriniz.");
			long studentId = scan.nextLong();
			System.out.println("Öğrenci Adı giriniz.");
			String firstName = scan.next();
			System.out.println("Öğrenci Soyadı giriniz.");
			String lastName = scan.next();
			System.out.println("Öğrenci yaşı giriniz.");
			int age= scan.nextInt();
			System.out.println("Öğrenci bölümü giriniz.");
			String department = scan.next();
			
			studentList.add(new Student(studentId, firstName, lastName, age, department) );
			}
	
			 write(studentList);
			 
			 read(file);
			 
		}catch(Exception e) {
			System.out.println("Bilgilerinizi kontrol ediniz.");
		}
	}
	
	public static void write(List inputList) {
		
		 try {
		      FileWriter myWriter = new FileWriter("src\\Question6\\Students.txt");
		      myWriter.write(inputList.toString());
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	
	public static void read(File file) {
	    try {
	      Scanner reader = new Scanner(file);
	      while (reader.hasNextLine()) {
	        String data = reader.nextLine();
	        System.out.println(data);
	      }
	      reader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }

}
