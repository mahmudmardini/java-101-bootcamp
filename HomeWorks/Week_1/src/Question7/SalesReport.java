package Question7;

import java.sql.Date;

public class SalesReport  extends Report{
	
	private String[] authorizedDepartment;
	
	SalesReport(){
		
	}
	
	public void setAuthorizedDepartment(String[] authorizedDepartment) {
		
		this.authorizedDepartment = authorizedDepartment;
		
	}
	
	
	public String[] get() {
		
		return authorizedDepartment;
	}
	
}
