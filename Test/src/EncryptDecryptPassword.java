import com.tibco.security.AXSecurityException;
import com.tibco.security.ObfuscationEngine;


public class EncryptDecryptPassword {

public static String getClearPass(String KeyPass)
{
	String clearKey="";
	try
	{
		clearKey=new String (ObfuscationEngine.decrypt(KeyPass));
	}
	catch(AXSecurityException e)
	{
		e.printStackTrace();
	}
	return clearKey;
}


}
