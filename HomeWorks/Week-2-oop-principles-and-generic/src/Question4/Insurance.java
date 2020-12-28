package Question4;

import java.sql.Date;

public abstract class Insurance {

	String insuranceName;
	double insurancePrice;
	Date insuranceStartDate, insuranceEndDate;
	
	public abstract double calculate();
}
