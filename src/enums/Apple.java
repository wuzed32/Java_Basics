package enums;

public enum Apple {
	Jonathan(10),
	GoldenDel(9),
	RedDel(12),
	Winesap(15),
	Cortland(8);
	
	private float price;
	
	Apple(float price) {
		this.price = price;
	}
	
	Apple() {
		this.price = -1;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
}
