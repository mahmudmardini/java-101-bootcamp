package Question1;

public class Question1 {

	private String password = "54321";
	
	public void checkPassword(String password) {
		
		if( password.equals( this.password ) ) {
			System.out.println("Giriş Başarılı!");
		}else {
			System.out.println("Giriş Başarısız");
		}
	}
	
}
