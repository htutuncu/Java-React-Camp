package Entities;

public class Campaign {
	private String name;
	private float discountRate;
	
	
	
	public Campaign(String name, float discountRate) {
		super();
		this.name = name;
		this.discountRate = discountRate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	
}
