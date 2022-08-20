package Payment;

public class Customer {
	public static void main(String args[]) {
		Credential credential = new Credential("kuldeep", "abc");
		
		if(Operation.swipe(credential)) {
			System.out.println(Operation.sendOffer(Operation.payment(8000)));
		}
	}
}
