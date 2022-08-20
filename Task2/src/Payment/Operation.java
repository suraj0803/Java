package Payment;

public class Operation {
	
	static final int  total_amount = 10000;
	
	static boolean swipe(Credential credentail) {
		if(Constants.USERNAME.equals("kuldeep")&&Constants.PASSWORD.equals("abc")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	static int payment(int deducted_amt) {
		int avail_amt = total_amount-deducted_amt;
		return avail_amt;
	}
	
	static Offer sendOffer(int avail_amt) {
		Offer offer = null;
		if(avail_amt<3000) {
			offer = new Offer("23","46","75");
		}
		else {
			offer = new Offer("2311","4115","7811");
		}
		return offer;
		
	}
}
