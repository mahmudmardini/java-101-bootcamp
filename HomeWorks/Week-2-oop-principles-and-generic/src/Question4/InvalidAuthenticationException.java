package Question4;

public class InvalidAuthenticationException extends Exception{

	String message;

	InvalidAuthenticationException(String message){
		this.setMessage(message);
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
