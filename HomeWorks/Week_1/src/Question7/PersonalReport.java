package Question7;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PersonalReport extends Report{

	PersonalReport(){
		
	}
	
	public String hashMD5Result() throws  NoSuchAlgorithmException {
		
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.update(result.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1,digest);
		String hashedResult = bigInt.toString(16);
		
		return hashedResult;
	}
}
