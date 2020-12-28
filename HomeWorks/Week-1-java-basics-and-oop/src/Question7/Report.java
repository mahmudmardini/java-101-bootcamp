package Question7;
import java.sql.Date;

public class Report {
	
	private String name;
	protected String result;
	private Date createDate;
	
	Report(){
		
	}
	
	public void setReport(String name, Date date) {
		createDate = date;
		this.name = name;
	}
	
	
	public String getReport() {
		return result;
	}
}
