package Question4;

public enum AuthenticationStatus {
	SUCCESS("200", "Successful"),
	FAIL("201", "Fail");
	
	String code, description;
	
	private AuthenticationStatus(String code, String description) {
		this.code = code;
		this.description = description;
	}
}
