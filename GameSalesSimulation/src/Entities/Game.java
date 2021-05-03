package Entities;

public class Game {
	private String name;
	private double price;
	
	
	public Game(String name, double d) {
		super();
		this.name = name;
		this.price = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
