package Question6;

public class main {

	public static void main(String[] args) {

		WordDocument wordDocument = new WordDocument("Word Document Body");
		
		PDFDocument pdfDocument = new PDFDocument("PDF Document Body");
		
		wordDocument.getBody();
		
		pdfDocument.getBody();
		
		Printer.printWordDocument(wordDocument);
		
		Printer.printPDFDocument(pdfDocument);
		
	}

}
