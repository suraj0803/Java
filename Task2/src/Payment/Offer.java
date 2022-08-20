package Payment;

public class Offer {
	public String discounts;
	public String reward_pts;
	public String privilages;
	public String getDiscounts() {
		return discounts;
	}
	public void setDiscounts(String discounts) {
		this.discounts = discounts;
	}
	public String getReward_pts() {
		return reward_pts;
	}
	public void setReward_pts(String reward_pts) {
		this.reward_pts = reward_pts;
	}
	public String getPrivilages() {
		return privilages;
	}
	public void setPrivilages(String privilages) {
		this.privilages = privilages;
	}
	@Override
	public String toString() {
		return "Offer [discounts=" + discounts + ", reward_pts=" + reward_pts + ", privilages=" + privilages + "]";
	}
	public Offer(String discounts, String reward_pts, String privilages) {
		super();
		this.discounts = discounts;
		this.reward_pts = reward_pts;
		this.privilages = privilages;
	}
	
	
}
