package Question6;

public class Printer {

	// printPDFDocument ve printWordDocument metotlari herhangi bir nesne yaratmadan 
	// cagirabilmemiz icin static olarak tanimladik.
	
	public static void printPDFDocument(PDFDocument pdfDocument){ 
		
		System.out.println(pdfDocument.getBody());
	}
	
	public static void printWordDocument(WordDocument wordDocument){
		
		System.out.println(wordDocument.getBody());
	}
}
