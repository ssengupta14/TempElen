import com.elenverve.dvo.personal.Address;
import com.elenverve.dvo.personal.BillingAddress;


public class Test {

	public static void main(String[] args) {
		
		 Address actor = new BillingAddress();
		 actor.setCity("newark");
         System.out.println(actor.getCity());
	}

}
