package Question2;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Book> books = new TreeSet<Book>();
		books.add(new Book("Java", "Steve", 2020, 260));
		books.add(new Book("PHP", "Mahmud", 2015, 366));
		books.add(new Book("Python", "Chuck", 2016, 510));
		books.add(new Book("ML", "Sami", 2012, 560));
		books.add(new Book("AI", "Ed", 2002, 480));
		
		System.out.println("A'dan Z'ye isme göre");
		printAll(books);
		
	
		BookComparatorByPageCount comparatorByPageCount = new BookComparatorByPageCount();
		Set<Book> sortedBooksByPageCount = new TreeSet<Book>(comparatorByPageCount);
		sortedBooksByPageCount.addAll(books);
		
		System.out.println("sayfa sayısına göre");
		printAll(sortedBooksByPageCount);
		
	}
	
	
	public static <T> void printAll(Set<T> set) {
		
		for(T item : set) {
			System.out.println(item);
		}
		System.out.println("-----------------------\n");
	}
}
