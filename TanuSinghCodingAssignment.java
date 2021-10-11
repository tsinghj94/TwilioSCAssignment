import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;

public class Example {
	// Find your Account SID and Auth Token at twilio.com/console
	// and set the environment variables. See http://twil.io/secure
	// public static final String ACCOUNT_SID = "ACb492cb6782c221e2d7b70a29baf50197";
	// public static final String AUTH_TOKEN = "0f89fd4881b05c41078960945c190754";
	// NOTE: I'm running this interactively. In order to run interactively, I've stored the codes in lines 10 and 11 in my local computer env variables.
	
	
	public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
	
	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message.creator(
		        new com.twilio.type.PhoneNumber("+61431851864"),
		        new com.twilio.type.PhoneNumber("+61428951639"),
		        "This is the coding assignment for Tanu Singh for the Senior SC Role.")
		    .setStatusCallback(URI.create("https://hookb.in/9XlMDW3lbyCW1OXX179n"))
		    .create();
		
		System.out.println(System.getenv("TWILIO_ACCOUNT_SID"));
		System.out.println(System.getenv("TWILIO_AUTH_TOKEN"));
		System.out.println(System.getenv("PATH"));
		System.out.println(message.getSid());
	}
}