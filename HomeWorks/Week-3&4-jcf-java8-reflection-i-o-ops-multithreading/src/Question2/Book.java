package Question2;

public class Book implements Comparable<Book>{

	private String name;
	
	private String publisher;
	
	private int publishYear;
	
	private int pageCount;
	
	
	public Book(String name, String publisher, int publishYear, int pageCount) {
		
		this.name = name;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.pageCount = pageCount;
	}

	public String getName() {
		return name;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public int getPageCount() {
		return pageCount;
	}


	@Override
	public int compareTo(Book book) {

		return this.getName().compareTo(book.getName());
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(this.getName());
		builder.append(" - ");
		builder.append(this.getPublisher());
		builder.append(" - ");
		builder.append(this.getPublishYear());
		builder.append(" - ");
		builder.append(this.getPageCount());
		builder.append("]");
		
		return builder.toString();
	}

}
